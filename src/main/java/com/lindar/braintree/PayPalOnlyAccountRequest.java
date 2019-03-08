package com.lindar.braintree;


import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PayPalOnlyAccountRequest {
    private String clientId;
    private String clientSecret;
    private MerchantRequest parent;

    public static PayPalOnlyAccountRequest from(com.braintreegateway.PayPalOnlyAccountRequest payPalOnlyAccountRequest) {
        return ObjectsAcolyte.copy(payPalOnlyAccountRequest, new PayPalOnlyAccountRequest());
    }
}
