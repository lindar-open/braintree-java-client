package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

@Data
public class OAuthCredentials {
    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private String scope;
    private Calendar expiresAt;

    public static OAuthCredentials from(com.braintreegateway.OAuthCredentials oAuthCredentials) {
        return ObjectsAcolyte.copy(oAuthCredentials, new OAuthCredentials());
    }
}
