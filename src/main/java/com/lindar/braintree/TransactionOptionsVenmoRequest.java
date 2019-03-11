package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionOptionsVenmoRequest {
    private TransactionOptionsRequest parent;
    private String profileId;

//    public static TransactionOptionsVenmoRequest from(com.braintreegateway.TransactionOptionsVenmoRequest transactionOptionsVenmoRequest) {
//        return ObjectsAcolyte.copy(transactionOptionsVenmoRequest, new TransactionOptionsVenmoRequest());
//    }
}
