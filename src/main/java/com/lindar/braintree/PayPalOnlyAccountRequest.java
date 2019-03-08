package com.lindar.braintree;


import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class PayPalOnlyAccountRequest {
    private String clientId;
    private String clientSecret;
    private MerchantRequest parent;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
