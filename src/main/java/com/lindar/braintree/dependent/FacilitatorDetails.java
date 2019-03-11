package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public final class FacilitatorDetails {
    private String oauthApplicationClientId;
    private String oauthApplicationName;
    private String sourcePaymentMethodToken;

    public static FacilitatorDetails from(com.braintreegateway.FacilitatorDetails facilitatorDetails) {
        return ObjectsAcolyte.copy(facilitatorDetails, new FacilitatorDetails());
    }
}
