package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionThreeDSecurePassThruRequest {
    private TransactionRequest parent;
    private String eciFlag;
    private String cavv;
    private String xid;

//    public static TransactionThreeDSecurePassThruRequest to(com.braintreegateway.TransactionThreeDSecurePassThruRequest transactionThreeDSecurePassThruRequest) {
//        return ObjectsAcolyte.copy(transactionThreeDSecurePassThruRequest, new TransactionThreeDSecurePassThruRequest());
//    }
}
