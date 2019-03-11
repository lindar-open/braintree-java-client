package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import lindar.acolyte.util.ObjectsAcolyte;
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

    public static IndividualDetails from(com.braintreegateway.IndividualDetails individualDetails) {
        IndividualDetails individualDetailsCopy = ObjectsAcolyte.copy(individualDetails, new IndividualDetails());
        individualDetailsCopy.setAddress(Address.from(individualDetails.getAddress()));
        return individualDetailsCopy;
    }
}
