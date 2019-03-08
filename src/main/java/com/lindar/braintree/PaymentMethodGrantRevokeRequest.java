package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class PaymentMethodGrantRevokeRequest {
    private String sharedPaymentMethodToken;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
