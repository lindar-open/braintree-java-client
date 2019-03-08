package com.lindar.braintree;

import com.lindar.braintree.dependant.ApplicantDetailsRequest;
import com.lindar.braintree.dependant.BusinessRequest;
import com.lindar.braintree.dependant.FundingRequest;
import com.lindar.braintree.dependant.IndividualRequest;
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
