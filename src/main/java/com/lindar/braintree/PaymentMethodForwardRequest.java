package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
/**
 * This class is deprecated. Please consider the the Grant API instead
 */
@Data
@Deprecated
public class PaymentMethodForwardRequest {
    private String token;
    private String receivingMerchantId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
