package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionOptionsVenmoRequest {
    private TransactionOptionsRequest parent;
    private String profileId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

}
