package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionCloneRequest {
    private BigDecimal amount;
    private String channel;
    private TransactionOptionsCloneRequest transactionOptionsCloneRequest;


    public static TransactionCloneRequest from(com.braintreegateway.TransactionCloneRequest transactionCloneRequest) {
        return ObjectsAcolyte.copy(transactionCloneRequest, new TransactionCloneRequest());
    }
}
