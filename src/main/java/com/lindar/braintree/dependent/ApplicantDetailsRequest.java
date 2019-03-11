package com.lindar.braintree.dependent;

import com.lindar.braintree.MerchantAccountRequest;
import lombok.Data;

@Data
public class ApplicantDetailsRequest {
    private String companyName;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private ApplicantDetailsAddressRequest address;
    private String dateOfBirth;
    private String ssn;
    private String taxId;
    private String routingNumber;
    private String accountNumber;
    private MerchantAccountRequest parent;

//    public static ApplicantDetailsRequest from(com.braintreegateway.ApplicantDetailsRequest applicantDetailsRequest) {
//        return ObjectsAcolyte.copy(applicantDetailsRequest, new ApplicantDetailsRequest());
//    }
}
