package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class IdealPaymentDetails {
    private String idealPaymentId;
    private String idealTransactionId;
    private String imageUrl;
    private String maskedIban;
    private String bic;

    public static IdealPaymentDetails from(com.braintreegateway.IdealPaymentDetails idealPaymentDetails) {
        return ObjectsAcolyte.copy(idealPaymentDetails, new IdealPaymentDetails());
    }
}
