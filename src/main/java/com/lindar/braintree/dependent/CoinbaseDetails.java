package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class CoinbaseDetails {
    private String userId;
    private String userEmail;
    private String userName;
    private String token;
    private String imageUrl;

    public static CoinbaseDetails from(com.braintreegateway.CoinbaseDetails coinbaseDetails) {
        return ObjectsAcolyte.copy(coinbaseDetails, new CoinbaseDetails());
    }
}
