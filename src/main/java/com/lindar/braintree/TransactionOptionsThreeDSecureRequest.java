package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionOptionsThreeDSecureRequest {
    private TransactionOptionsRequest parent;
    private boolean required;

//    public static TransactionOptionsThreeDSecureRequest from(com.braintreegateway.TransactionOptionsThreeDSecureRequest transactionOptionsThreeDSecureRequest) {
//        return ObjectsAcolyte.copy(transactionOptionsThreeDSecureRequest, new TransactionOptionsThreeDSecureRequest());
//    }
}
