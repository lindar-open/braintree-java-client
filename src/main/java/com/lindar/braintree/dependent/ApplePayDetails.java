package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class ApplePayDetails {
    private String cardType;
    private String paymentInstrumentName;
    private String sourceDescription;
    private String cardholderName;
    private String expirationMonth;
    private String expirationYear;
    private String last4;
    private String token;
    private String imageUrl;
    private String prepaid;
    private String healthcare;
    private String debit;
    private String durbinRegulated;
    private String commercial;
    private String payroll;
    private String issuingBank;
    private String countryOfIssuance;
    private String productId;
    private String bin;
    private String globalId;

    public static ApplePayDetails from(com.braintreegateway.ApplePayDetails applePayDetails) {
        return ObjectsAcolyte.copy(applePayDetails, new ApplePayDetails());
    }
}
