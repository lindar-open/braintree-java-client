package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class TransactionOptionsCloneRequest {
    private TransactionCloneRequest parent;
    private Boolean submitForSettlement;

    public static TransactionOptionsCloneRequest from(com.braintreegateway.TransactionOptionsCloneRequest transactionOptionsCloneRequest) {
        return ObjectsAcolyte.copy(transactionOptionsCloneRequest, new TransactionOptionsCloneRequest());
    }
}
