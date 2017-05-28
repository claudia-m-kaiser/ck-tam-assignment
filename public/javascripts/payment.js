function loadPayPalButton(clientToken){

    var options = {
        flow: "checkout", // Required
        amount: 1.00, // Required
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
                                        showOverlay("We are processing your payment. Please wait...");

                                        //Submitting payment method nonce to the server
                                        $.post(jsRoutes.controllers.HomeController.saleTransaction(), { nonce: payload.nonce })
                                            .done(data => {
                                            if(data.processorResponseCode === "2074"){
                                            //Restarting PayPal flow, after an instrument decline
                                            showOverlay("There was an issue processing your payment. Please try a different payment method...");
                                            setTimeout(function() {
                                                actions.restart();
                                            }, 2000);
                                        }else
                                        {
                                            document.location.href = "/confirmation?transactionId=" + data.id;
                                        }
                                    })
                                    .fail(() => { alert("Error creating transaction");});

                    });
                },

                onCancel: function (data) {
                    hideOverlay();
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

