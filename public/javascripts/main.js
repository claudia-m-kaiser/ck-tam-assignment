
$("#address-form").on("click","button",(function(){
    event.preventDefault();
    var action = $(this).attr("data-button-action");
    if(action === "changeAddress"){

        hidePaymentOptions();
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

function hidePaymentOptions(){
    $("#paypal-button").html("");//Remove PayPal button
    $("#payment").addClass("hidden"); //Hide payment options
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

function showOverlay(message){
    $("#overlay-message").text(message);
    $("#overlay").fadeIn();
}

function hideOverlay(){
    $("#overlay-message").text("");
    $("#overlay").hide();
}
