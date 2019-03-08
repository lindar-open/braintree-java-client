package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class TransactionThreeDSecurePassThruRequest {
    private TransactionRequest parent;
    private String eciFlag;
    private String cavv;
    private String xid;

    public static TransactionThreeDSecurePassThruRequest to(com.braintreegateway) {
        return ObjectsAcolyte.copy();
    }

}
