package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class AndroidPayDetails {
    private String cardType;
    private String last4;
    private String sourceCardType;
    private String sourceCardLast4;
    private String sourceDescription;
    private String virtualCardType;
    private String virtualCardLast4;
    private String expirationMonth;
    private String expirationYear;
    private String token;
    private String googleTransactionId;
    private String bin;
    private String imageUrl;

    public static AndroidPayDetails from(com.braintreegateway.AndroidPayDetails androidPayDetails) {
        return ObjectsAcolyte.copy(androidPayDetails, new AndroidPayDetails());
    }
}
