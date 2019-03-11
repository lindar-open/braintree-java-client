package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
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

    public static UsBankAccountDetails from(com.braintreegateway.UsBankAccountDetails usBankAccountDetails) {
        UsBankAccountDetails usBankAccountDetailsCopy = ObjectsAcolyte.copy(usBankAccountDetails, new UsBankAccountDetails());
        usBankAccountDetailsCopy.setAchMandate(AchMandate.from(usBankAccountDetails.getAchMandate()));
        return usBankAccountDetailsCopy;
    }
}
