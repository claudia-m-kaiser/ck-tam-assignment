package controllers;

import com.braintreegateway.Transaction;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import service.BraintreeService;
import play.mvc.Controller;
import play.mvc.Result;
import play.routing.JavaScriptReverseRouter;
import javax.inject.Inject;
import java.util.Map;

public class HomeController extends Controller {

    private BraintreeService braintreeService;


    @Inject
    public HomeController(BraintreeService braintreeService){
        this.braintreeService = braintreeService;
    }

    public Result payment() {

        //Getting Braintree client token and rendering payment page.
        String token = this.braintreeService.getToken();
        return ok(views.html.payment.render(token));
    }

    public Result getClientToken(){
        ObjectNode result = Json.newObject();
        result.put("clientToken" ,this.braintreeService.getToken());
        return ok(result);
    }

    public Result saleTransaction(){

        final Map<String, String[]> values = request().body().asFormUrlEncoded();

        String nonce = values.get("nonce")[0];

        // Capturing the funds using the nonce received from the client
        com.braintreegateway.Result<Transaction> transactionResult = this.braintreeService.saleTransaction(nonce);
        if(transactionResult.getTarget() == null) {
            return ok(transactionInformation(transactionResult.getTransaction()));
        } else {
            return ok(transactionInformation(transactionResult.getTarget()));
        }
    }

    public Result paymentConfirmation(String transactionId){

        Transaction transaction = this.braintreeService.getTransaction(transactionId);
        return ok(views.html.confirmation.render(transaction));
    }

    private ObjectNode transactionInformation(Transaction transaction){

        //Bulding Json object with the transaction information
        ObjectNode result = Json.newObject();

        result.put("status", transaction.getStatus().toString());
        result.put("id", transaction.getId());
        result.put("processorResponseCode", transaction.getProcessorResponseCode());
        result.put("processorResponseText", transaction.getProcessorResponseText());
        result.set("paypalDetails", Json.toJson(transaction.getPayPalDetails()));

        transaction.getPayPalDetails.
        return result;
    }

    public Result javascriptRoutes() {
        return ok(
                JavaScriptReverseRouter.create("jsRoutes",
                        controllers.routes.javascript.HomeController.getClientToken(),
                        controllers.routes.javascript.HomeController.saleTransaction()
                )
        ).as("text/javascript");
    }

}
