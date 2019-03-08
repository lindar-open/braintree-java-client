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
}
