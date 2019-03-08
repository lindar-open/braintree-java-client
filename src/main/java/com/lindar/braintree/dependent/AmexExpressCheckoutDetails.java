package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class AmexExpressCheckoutDetails {
    private String cardType;
    private String token;
    private String bin;
    private String expirationMonth;
    private String expirationYear;
    private String cardMemberNumber;
    private String cardMemberExpiryDate;
    private String imageUrl;
    private String sourceDescription;
}
