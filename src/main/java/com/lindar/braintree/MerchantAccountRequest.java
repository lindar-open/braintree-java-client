package com.lindar.braintree;

import com.lindar.braintree.dependent.ApplicantDetailsRequest;
import com.lindar.braintree.dependent.BusinessRequest;
import com.lindar.braintree.dependent.FundingRequest;
import com.lindar.braintree.dependent.IndividualRequest;
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



}
