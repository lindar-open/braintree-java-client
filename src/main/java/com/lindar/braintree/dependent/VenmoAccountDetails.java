package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class VenmoAccountDetails {
    private String token;
    private String username;
    private String venmoUserId;
    private String imageUrl;
    private String sourceDescription;
}
