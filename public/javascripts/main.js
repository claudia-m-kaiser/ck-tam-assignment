
$("#address-form").on("click","button",(function(){
    event.preventDefault();
    var action = $(this).attr("data-button-action");
    if(action === "changeAddress"){

        $("#paypal-button").html("");//Remove PayPal button
        $("#payment").addClass("hidden"); //Hide payment options
        $("#loading-paypal-spinner").removeClass("hidden");

        enableAddressForm();
    }
    if(action === "payment") {
        showPaymentOptions();
    }

}));

function showPaymentOptions(){
    if(!addressFormIsValid()){
        alert("Please fill in your address details");
    }else{
        disableAddressForm();
        loadPayPalButton(clientToken);
        $("#payment").removeClass("hidden");
        document.location.href="#payment";
    }
}

function addressFormIsValid(){
    //Checking if all input values are at least 2 characters long
    var valid = true;
    $(".form-control").each(function() {
        if($(this).val().length<=2){
            valid = false;
        }
    })
    return valid;
}

function disableAddressForm(){
    $(".form-control").each(function(){
        $(this).prop("disabled", true);
        $(this).removeClass("form-control-success").closest(".form-group").removeClass("has-success");
    });
    $("#form-button").html("Change address details");
    $("#form-button").removeClass("btn-success").addClass("btn-default");
    $("#form-button").attr("data-button-action", "changeAddress");
}

function enableAddressForm(){
    $(".form-control").each(function(){$(this).prop("disabled", false);});
    $("#form-button").html("Continue to payment");
    $("#form-button").removeClass("btn-default").addClass("btn-success");
    $("#form-button").attr("data-button-action", "payment");
}

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

        client = clientInstance;
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
                                $("#overlay").fadeIn();

                            //Submitting payment method nonce to the server
                            $.post(jsRoutes.controllers.HomeController.saleTransaction(), { nonce: payload.nonce })
                                .done(data => {
                                    if(data.processorResponseCode === "2074"){
                                        //Restarting PayPal flow, after an instrument decline
                                        actions.restart();
                                    }else
                                    {
                                        showTransactionResult(data);
                                        $("#overlay").fadeOut();
                                    }
                                })
                                .fail(() => { alert("Error creating transaction");});

                        });
                },

                onCancel: function (data) {
                    console.log("checkout.js payment cancelled", JSON.stringify(data, 0, 2));
                },

                onError: function (err) {
                    console.error("checkout.js error", err);
                }
            }, "#paypal-button").then(function () {
                //The PayPal button is ready to be used
                $("#loading-paypal-spinner").addClass("hidden");
            });


        });

    });
}

$( ".form-control").keyup(function() {

    //Inputs values less than 2 characters long will be considered invalid.
    if($(this).val().length >= 2)  {
        $(this).removeClass("form-control-error").closest(".form-group").removeClass("has-error");
        $(this).addClass("form-control-success").closest(".form-group").addClass("has-success");
    }else{
        $(this).removeClass("form-control-success").closest(".form-group").removeClass("has-success");
        $(this).addClass("form-control-error").closest(".form-group").addClass("has-error");
    }
});

function showTransactionResult(transaction){

    //Displaying the transaction result on the page
    $("#json").html(JSON.stringify(transaction,null,3));
    $("#transactionResult").removeClass("hidden");

    if(transaction.processorResponseCode == "1000"){ //if transaction was approved
        $("#payment-alert").html("Payment successful");
        $("#payment-alert").removeClass("alert-danger").addClass("alert-success");
    }else{
        $("#payment-alert").html("Payment unsuccessful");
        $("#payment-alert").removeClass("alert-success").addClass("alert-danger");
    }
}