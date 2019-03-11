package com.lindar.braintree;

import lombok.Data;

@Data
public class PaymentMethodGrantRequest {
    private String sharedPaymentMethodToken;
    private boolean allowVaulting;
    private boolean includeBillingPostalCode;
    private String revokeAfter;

//    public static PaymentMethodGrantRequest from(com.braintreegateway.PaymentMethodGrantRequest paymentMethodGrantRequest) {
//        return ObjectsAcolyte.copy(paymentMethodGrantRequest, new PaymentMethodGrantRequest());
//    }
}


