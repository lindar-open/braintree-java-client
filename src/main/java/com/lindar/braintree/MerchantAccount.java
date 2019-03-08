package com.lindar.braintree;


import com.lindar.braintree.dependent.BusinessDetails;
import com.lindar.braintree.dependent.FundingDetails;
import com.lindar.braintree.dependent.IndividualDetails;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class MerchantAccount {

    public enum Status {
        PENDING,
        ACTIVE,
        SUSPENDED,
        UNRECOGNIZED
    }

    public enum FundingDestination {
        BANK("bank"),
        MOBILE_PHONE("mobile_phone"),
        EMAIL("email"),
        UNRECOGNIZED("unrecognized");

        private final String name;

        FundingDestination(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private String id;
    private Status status;
    private MerchantAccount masterMerchantAccount;
    private IndividualDetails individualDetails;
    private BusinessDetails businessDetails;
    private FundingDetails fundingDetails;
    private String currencyIsoCode;
    private Boolean isDefault;

    public static MerchantAccount from(com.braintreegateway.MerchantAccount merchantAccount) {
        return ObjectsAcolyte.copy(merchantAccount, new MerchantAccount());
    }
}

