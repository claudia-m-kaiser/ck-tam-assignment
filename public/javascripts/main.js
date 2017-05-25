$("#continue-to-payment").click(function(){
    event.preventDefault();
    if(!addressFormIsValid()){
        alert("Please fill in your address details");
    }else{
        loadPayPalButton(clientToken);
        $("#payment").removeClass("hidden");
        document.location.href="#payment";
    }

});

function loadPayPalButton(clientToken){

    var options = {
        flow: "checkout", // Required
        amount: 10.00, // Required
        currency: "AUD", // Required
        locale: "en_AU",
        enableShippingAddress: true,
        shippingAddressEditable: false,
        shippingAddressOverride: {
            recipientName: document.getElementById("name").value,
            line1: document.getElementById("streetAddress").value,
            city: document.getElementById("suburb").value,
            postalCode: document.getElementById("postcode").value,
            state: document.getElementById("state").value,
            countryCode: "AU"

         }
    };

    // Create a client.
    braintree.client.create({
        authorization: clientToken
    }, function (clientErr, clientInstance) {

        // Stop if there was a problem creating the client.
        // This could happen if there is a network error or if the authorization
        // is invalid.
        if (clientErr) {
            console.error("Error creating client:", clientErr);
            return;
        }

        // Create a PayPal Checkout component.
        braintree.paypalCheckout.create({
            client: clientInstance
        }, function (paypalCheckoutErr, paypalCheckoutInstance) {

            // Stop if there was a problem creating PayPal Checkout.
            // This could happen if there was a network error or if it"s incorrectly
            // configured.
            if (paypalCheckoutErr) {
                console.error("Error creating PayPal Checkout:", paypalCheckoutErr);
                return;
            }

            // Set up PayPal with the checkout.js library
            paypal.Button.render({
                env: "sandbox", // or "production"

                payment: function () {
                    return paypalCheckoutInstance.createPayment(options);
                },

                onAuthorize: function (data, actions) {
                    return paypalCheckoutInstance.tokenizePayment(data)
                        .then(function (payload) {
                            $.post(jsRoutes.controllers.HomeController.saleTransaction(), { nonce: payload.nonce })
                                .done(data => {console.log(data);})
                                .fail(() => { alert("Error creating transaction");});

                            // Submit `payload.nonce` to your server
                        });
                },

                onCancel: function (data) {
                    console.log("checkout.js payment cancelled", JSON.stringify(data, 0, 2));
                },

                onError: function (err) {
                    console.error("checkout.js error", err);
                }
            }, "#paypal-button").then(function () {
                // The PayPal button will be rendered in an html element with the id
                // `paypal-button`. This function will be called when the PayPal button
                // is set up and ready to be used.
            });


        });

    });
}

$( ".form-control").keyup(function() {
    if($(this).val().length >= 2)  {
        if($(this).hasClass("form-control-danger")){
            $(this).removeClass("form-control-danger").closest(".form-group").removeClass("has-danger");
        }
        $(this).addClass("form-control-success").closest(".form-group").addClass("has-success");
    }else{
        if($(this).hasClass("form-control-success")){
            $(this).removeClass("form-control-success").closest(".form-group").removeClass("has-success");
        }
        $(this).addClass("form-control-danger").closest(".form-group").addClass("has-danger");
    }
});


function addressFormIsValid(){
    var valid = true;
    $(".form-control").each(function() {
        if($(this).val().length<=2){
            valid = false;
        }
    })
    return valid;
}