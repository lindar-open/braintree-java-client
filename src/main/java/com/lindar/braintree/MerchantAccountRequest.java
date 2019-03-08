package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
/**
 * Provides a fluent interface to build up requests around {@link MerchantAccount MerchantAccounts}.
 */
@Data
public class MerchantAccountRequest {

    private ApplicantDetailsRequest applicantDetails;
    private IndividualRequest individual;
    private BusinessRequest business;
    private FundingRequest funding;
    private Boolean tosAccepted;
    private String masterMerchantAccountId;
    private String id;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }

}
