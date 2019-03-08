package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class UsBankAccountDetails {
    private String routingNumber;
    private String last4;
    private String accountType;
    private String accountHolderName;
    private String token;
    private String imageUrl;
    private String bankName;
    private AchMandate achMandate;
}
