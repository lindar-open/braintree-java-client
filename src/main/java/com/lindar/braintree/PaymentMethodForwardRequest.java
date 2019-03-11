package com.lindar.braintree;

import lombok.Data;
/**
 * This class is deprecated. Please consider the the Grant API instead
 */
@Data
@Deprecated
public class PaymentMethodForwardRequest {
    private String token;
    private String receivingMerchantId;

//    public static PaymentMethodForwardRequest from(com.braintreegateway.PaymentMethodForwardRequest paymentMethodForwardRequest) {
//        return ObjectsAcolyte.copy(paymentMethodForwardRequest, new PaymentMethodForwardRequest());
//    }
}
