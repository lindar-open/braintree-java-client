package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionOptionsCloneRequest {
    private TransactionCloneRequest parent;
    private Boolean submitForSettlement;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
}
