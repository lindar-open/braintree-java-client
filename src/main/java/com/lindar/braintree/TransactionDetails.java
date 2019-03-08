package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;

@Data
public final class TransactionDetails {
    private String id;
    private BigDecimal amount;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
