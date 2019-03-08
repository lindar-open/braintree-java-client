package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

/**
 * Provides a fluent interface to build up refund requests around {@link Transaction Transactions}.
 */
@Data
public class TransactionRefundRequest {
    private BigDecimal amount;
    private String orderId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

}
