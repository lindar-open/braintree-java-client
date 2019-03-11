package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public final class FacilitatedDetails {
    private String merchantId;
    private String merchantName;
    private String paymentMethodNonce;

    public static FacilitatedDetails from(com.braintreegateway.FacilitatedDetails facilitatedDetails) {
        return ObjectsAcolyte.copy(facilitatedDetails, new FacilitatedDetails());
    }
}
