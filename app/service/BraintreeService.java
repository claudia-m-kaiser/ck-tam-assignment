package service;

import com.braintreegateway.*;
import play.Configuration;

import javax.inject.Inject;
import java.math.BigDecimal;

/**
 * Created by clkaiser on 22/05/2017.
 */
public class BraintreeService {

    private BraintreeGateway gateway;

    @Inject

    public BraintreeService(Configuration conf) {
        //Generating new Braintree client token
        this.gateway = new BraintreeGateway(
                conf.getString("paypal.access-token")//Access token is set in the application.conf file
        );
    }

    public String getToken(){
        return this.gateway.clientToken().generate();
    }

    public Result<Transaction> saleTransaction(String nonce) {

        TransactionRequest transactionRequest = new TransactionRequest()
                .amount(new BigDecimal("1.00"))
                .paymentMethodNonce(nonce)
                .options()
                    .submitForSettlement(true)
                    .done();

        Result<Transaction> transactionResult = this.gateway.transaction().sale(transactionRequest);

        return transactionResult;
    }


}
