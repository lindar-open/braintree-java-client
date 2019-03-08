package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public final class FacilitatorDetails {
    private final String oauthApplicationClientId;
    private final String oauthApplicationName;
    private final String sourcePaymentMethodToken;
}
