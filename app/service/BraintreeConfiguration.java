package service;

/**
 * Created by clkaiser on 22/05/2017.
 */
public class BraintreeConfiguration {

    public enum BraintreeEnvironment {
        Sandbox,Production
    }

    private final String merchantId;
    private final String publicKey;
    private final String privateKey;

    public BraintreeConfiguration(String merchantId, String publicKey, String privateKey) {
        this.merchantId = merchantId;
        this.publicKey = publicKey;
        this.privateKey = privateKey;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

}
