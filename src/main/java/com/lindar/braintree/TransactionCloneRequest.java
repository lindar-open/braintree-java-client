package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionCloneRequest {
    private BigDecimal amount;
    private String channel;
    private TransactionOptionsCloneRequest transactionOptionsCloneRequest;


    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
