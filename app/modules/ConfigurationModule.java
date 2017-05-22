package modules;

import com.google.inject.AbstractModule;
import play.Configuration;
import play.Environment;
import play.mvc.Http;
import service.BraintreeConfiguration;

import static service.BraintreeConfiguration.BraintreeEnvironment;

/**
 * Created by clkaiser on 22/05/2017.
 */
public class ConfigurationModule extends AbstractModule {

    private static final String ENVIRONMENT_KEY = "ENVIRONMENT";

    private final Configuration conf;

    public ConfigurationModule(Environment environment, Configuration configuration) {
        this.conf = configuration;
    }

    @Override
    protected void configure() {
        bind(BraintreeConfiguration.class).toProvider(() -> {
            Configuration environment;
            if (BraintreeEnvironment.Production.name().equals(Http.Context.current().session().get(ENVIRONMENT_KEY))) {
                environment = conf.getConfig("braintree.production");
            } else {
                environment = conf.getConfig("braintree.sandbox");
            }

            return new BraintreeConfiguration(environment.getString("MerchantID"), environment.getString("PublicKey"),
                    environment.getString("PrivateKey"));
        });
    }

}
