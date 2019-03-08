package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import lombok.Data;

@Data
public final class IndividualDetails {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String email;
    private String phone;
    private Address address;
    private String ssnLast4;
}
