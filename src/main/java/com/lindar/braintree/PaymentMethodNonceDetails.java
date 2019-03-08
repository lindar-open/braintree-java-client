package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PaymentMethodNonceDetails {
    private String cardType;
    private String cardholderName;
    private String dpanLastTwo;
    private String email;
    private String bin;
    private String lastFour;
    private String lastTwo;
    private String paymentInstrumentName;
    private String username;
    private String venmoUserId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
