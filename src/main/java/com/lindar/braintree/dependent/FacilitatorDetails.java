package com.lindar.braintree.dependant;

import lombok.Data;

@Data
public final class FacilitatorDetails {
    private final String oauthApplicationClientId;
    private final String oauthApplicationName;
    private final String sourcePaymentMethodToken;
}
