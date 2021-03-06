package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public final class DisputeTransaction {
    private BigDecimal amount;
    private Calendar createdAt;
    private String id;
    private String orderId;
    private String paymentInstrumentSubtype;
    private String purchaseOrderNumber;

    public static DisputeTransaction from(com.braintreegateway.DisputeTransaction disputeTransaction) {
        return ObjectsAcolyte.copy(disputeTransaction, new DisputeTransaction());
    }
}
