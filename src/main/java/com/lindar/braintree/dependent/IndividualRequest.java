package com.lindar.braintree.dependent;

import com.lindar.braintree.MerchantAccountRequest;
import lombok.Data;

@Data
public class IndividualRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private IndividualAddressRequest address;
    private String dateOfBirth;
    private String ssn;
    private MerchantAccountRequest parent;

//    public static IndividualRequest from(com.braintreegateway.IndividualRequest individualRequest) {
//        return ObjectsAcolyte.copy(individualRequest, new IndividualRequest());
//    }
}
