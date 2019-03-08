package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;

@Data
public final class TransactionDetails {
    private String id;
    private BigDecimal amount;

    public static TransactionDetails from(com.braintreegateway.TransactionDetails transactionDetails) {
        return ObjectsAcolyte.copy(transactionDetails, new TransactionDetails());
    }
}
