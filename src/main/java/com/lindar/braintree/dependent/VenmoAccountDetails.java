package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class VenmoAccountDetails {
    private String token;
    private String username;
    private String venmoUserId;
    private String imageUrl;
    private String sourceDescription;

    public static VenmoAccountDetails from(com.braintreegateway.VenmoAccountDetails venmoAccountDetails) {
        return ObjectsAcolyte.copy(venmoAccountDetails, new VenmoAccountDetails());
    }
}
