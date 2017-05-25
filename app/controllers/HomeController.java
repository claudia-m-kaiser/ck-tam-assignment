package controllers;

import com.braintreegateway.Transaction;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Http;
import service.BraintreeService;
import play.mvc.Controller;
import play.mvc.Result;
import play.routing.JavaScriptReverseRouter;


import javax.inject.Inject;
import java.util.Map;

import static play.libs.Json.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    private BraintreeService braintreeService;


    @Inject
    public HomeController(BraintreeService braintreeService){
        this.braintreeService = braintreeService;
    }

    public Result index() {

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
        //String deviceData = requestValues.get("device_data").toString();

        // Capturing the funds using the nonce received from the client

        com.braintreegateway.Result<Transaction> transactionResult = this.braintreeService.saleTransaction(nonce);

        ObjectNode result = Json.newObject();

        if(transactionResult.getTarget() == null) {
            return ok(transactionInformation(transactionResult.getTransaction()));
        } else {
            return ok(transactionInformation(transactionResult.getTarget()));
        }
    }

    private ObjectNode transactionInformation(Transaction transaction){

        ObjectNode result = Json.newObject();

        result.put("status", transaction.getStatus().toString());
        result.put("id", transaction.getId());
        result.put("processorResponseCode", transaction.getProcessorResponseCode());
        result.put("processorResponseText", transaction.getProcessorResponseText());
        result.set("paypalDetails", Json.toJson(transaction.getPayPalDetails()));
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
