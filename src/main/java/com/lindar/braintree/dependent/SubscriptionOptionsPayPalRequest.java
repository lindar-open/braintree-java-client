package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class SubscriptionOptionsPayPalRequest {
    private SubscriptionOptionsRequest parent;
    private String description;
}
