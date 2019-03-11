package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionPayPalRequest {
    private TransactionRequest parent;
    private String payeeId;
    private String payeeEmail;
    private String payerId;
    private String paymentId;

//    public static TransactionPayPalRequest from(com.braintreegateway.TransactionPayPalRequest transactionPayPalRequest) {
//        return ObjectsAcolyte.copy(transactionPayPalRequest, new TransactionPayPalRequest());
//    }
}
