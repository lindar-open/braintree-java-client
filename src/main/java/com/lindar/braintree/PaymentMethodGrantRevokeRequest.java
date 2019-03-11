package com.lindar.braintree;

import lombok.Data;

@Data
public class PaymentMethodGrantRevokeRequest {
    private String sharedPaymentMethodToken;

//    public static PaymentMethodGrantRevokeRequest from(com.braintreegateway.PaymentMethodGrantRevokeRequest paymentMethodGrantRevokeRequest) {
//        return ObjectsAcolyte.copy(paymentMethodGrantRevokeRequest, new PaymentMethodGrantRevokeRequest());
//    }
}
