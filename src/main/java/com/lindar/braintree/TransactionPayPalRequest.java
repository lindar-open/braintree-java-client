package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionPayPalRequest {
    private TransactionRequest parent;
    private String payeeId;
    private String payeeEmail;
    private String payerId;
    private String paymentId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
}
