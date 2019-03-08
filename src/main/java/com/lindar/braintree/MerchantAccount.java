package com.lindar.braintree;


import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Value;

@Value
public class MerchantAccount {

    private final String id;
    private final Transaction.Status status;
    private final MerchantAccount masterMerchantAccount;
    private final IndividualDetails individualDetails;
    private final BusinessDetails businessDetails;
    private final FundingDetails fundingDetails;
    private final String currencyIsoCode;
    private final Boolean isDefault;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}

