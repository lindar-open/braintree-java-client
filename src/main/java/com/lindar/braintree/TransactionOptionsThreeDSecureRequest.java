package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionOptionsThreeDSecureRequest {
    private TransactionOptionsRequest parent;
    private boolean required;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
}
