package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PaymentMethodDeleteRequest {
    private boolean revokeAllGrants;

    public static PaymentMethodDeleteRequest from(com.braintreegateway.PaymentMethodDeleteRequest paymentMethodDeleteRequest) {
        return ObjectsAcolyte.copy(paymentMethodDeleteRequest, new PaymentMethodDeleteRequest());
    }
}
