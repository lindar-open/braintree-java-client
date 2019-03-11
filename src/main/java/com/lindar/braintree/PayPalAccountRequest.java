package com.lindar.braintree;

import lombok.Data;

@Data
public class PayPalAccountRequest {
    private String token;
    private PayPalAccountOptionsRequest optionsRequest;

//    public static PayPalAccountRequest from(com.braintreegateway.PayPalAccountRequest payPalAccountRequest) {
//        return ObjectsAcolyte.copy(payPalAccountRequest, new PayPalAccountRequest());
//    }
}
