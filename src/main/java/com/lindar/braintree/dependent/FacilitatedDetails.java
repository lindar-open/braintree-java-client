package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public final class FacilitatedDetails {
    private final String merchantId;
    private final String merchantName;
    private final String paymentMethodNonce;
}
