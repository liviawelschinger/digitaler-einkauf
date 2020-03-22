package org.wirvsvirushackathon.einkaufendigitalbackend.paypal.config;

import com.paypal.base.rest.APIContext;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;
import com.paypal.base.rest.OAuthTokenCredential;

@Configuration
public class PaypalConfig {

    @Value("${paypal.client.id}")
    private String clientId;

    @Value("${paypal.client.secret}")
    private String clientSecret;

    @Value("${paypal.mode}")
    private String mode;

    @Bean
    public Map<String, String> paypalSdkConfig() {
        Map<String, String> configMap = new HashMap<>();
        configMap.put("mode", mode);
        return configMap;
    }

    // TODO faellt wahrscheinlich weg
    @Bean
    public OAuthTokenCredential oAuthTokenCredential() {
        return new OAuthTokenCredential(clientId, clientSecret, paypalSdkConfig());
    }

    // https://github.com/paypal/PayPal-Java-SDK/blob/master/rest-api-sdk/src/main/java/com/paypal/base/rest/APIContext.java

    @Bean
    public APIContext apiContext() throws PayPalRESTException {
        APIContext apiContext = new APIContext(clientId, clientSecret, mode, paypalSdkConfig());
        apiContext.setConfigurationMap(paypalSdkConfig());
        return apiContext;
    }

}
