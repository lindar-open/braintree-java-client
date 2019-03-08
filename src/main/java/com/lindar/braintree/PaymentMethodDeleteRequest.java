package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PaymentMethodDeleteRequest {
    private boolean revokeAllGrants;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

}
