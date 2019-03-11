package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public final class BusinessDetails {
    private String dbaName;
    private String legalName;
    private String taxId;
    private Address address;

    public static BusinessDetails from(com.braintreegateway.BusinessDetails businessDetails) {
        BusinessDetails businessDetailsCopy = ObjectsAcolyte.copy(businessDetails, new BusinessDetails());
        businessDetailsCopy.setAddress(Address.from(businessDetails.getAddress()));
        return businessDetailsCopy;
    }
}
