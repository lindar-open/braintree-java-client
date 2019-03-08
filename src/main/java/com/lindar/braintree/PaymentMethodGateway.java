package com.lindar.braintree;

import com.braintreegateway.util.Http;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import javax.security.auth.login.Configuration;

@Data
public class PaymentMethodGateway {
    private Http http;
    private Configuration configuration;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
