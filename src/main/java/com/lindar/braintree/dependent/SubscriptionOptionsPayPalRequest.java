package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class SubscriptionOptionsPayPalRequest {
    private SubscriptionOptionsRequest parent;
    private String description;

//    public static SubscriptionOptionsPayPalRequest from(com.braintreegateway.SubscriptionOptionsPayPalRequest subscriptionOptionsPayPalRequest) {
//        return ObjectsAcolyte.copy(subscriptionOptionsPayPalRequest, new SubscriptionOptionsPayPalRequest());
//    }
}
