package com.lindar.braintree.dependent;

import lombok.Data;

import java.util.Calendar;

@Data
public class OAuthCredentials {
    private String accessToken;
    private String refreshToken;
    private String tokenType;
    private String scope;
    private Calendar expiresAt;
}
