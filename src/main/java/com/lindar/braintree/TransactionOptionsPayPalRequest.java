package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.util.Map;

@Data
public class TransactionOptionsPayPalRequest {
    private TransactionOptionsRequest parent;
    private String customField;
    private String payeeId;
    private String payeeEmail;
    private String description;
    private Map<String, String> supplementaryData;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
}
