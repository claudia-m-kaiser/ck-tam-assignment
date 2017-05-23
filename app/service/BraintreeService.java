package service;

import com.braintreegateway.*;
import play.Configuration;
import play.Logger;

import javax.inject.Inject;
import java.math.BigDecimal;

/**
 * Created by clkaiser on 22/05/2017.
 */
public class BraintreeService {

    private BraintreeGateway gateway;

    @Inject
    public BraintreeService(Configuration conf) {
        this.gateway = new BraintreeGateway(
                conf.getString("paypal.access-token")
        );
    }

    public String getToken(){
        return this.gateway.clientToken().generate();
    }

    public Transaction saleTransaction(String nonce) {

        TransactionRequest transactionRequest = new TransactionRequest()
                .amount(new BigDecimal("1.00"))
                .paymentMethodNonce(nonce)
                //.deviceData(deviceData)
                .options()
                .submitForSettlement(true)
                .done();

        Result<Transaction> transactionResult = this.gateway.transaction().sale(transactionRequest);

        return checkTransactionResult(transactionResult);
    }

    private Transaction checkTransactionResult(Result<Transaction> transactionResult){
        if (transactionResult.isSuccess()) {

            Logger.info("Success!: " + transactionResult.getTarget().getId());
            return transactionResult.getTarget();

        } else {
            Logger.error("Error!: " + transactionResult.getMessage());
            return null;
        }
    }

}
