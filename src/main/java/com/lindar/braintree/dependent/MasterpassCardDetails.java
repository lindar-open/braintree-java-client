package com.lindar.braintree.dependant;

import lombok.Data;

@Data
public class MasterpassCardDetails {
    private String bin;
    private String cardType;
    private String cardholderName;
    private String expirationMonth;
    private String expirationYear;
    private String imageUrl;
    private String issuerLocation;
    private String last4;
    private String paymentInstrumentName;
    private String token;
    private String commercial;
    private String debit;
    private String durbinRegulated;
    private String healthcare;
    private String payroll;
    private String prepaid;
    private String productId;
    private String countryOfIssuance;
    private String issuingBank;
}
