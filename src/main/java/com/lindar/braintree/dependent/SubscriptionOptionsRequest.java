package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class SubscriptionOptionsRequest {
    private Boolean doNotInheritAddOnsOrDiscounts;
    private SubscriptionRequest parent;
    private Boolean prorateCharges;
    private Boolean replaceAllAddOnsAndDiscounts;
    private Boolean revertSubscriptionOnProrationFailure;
    private Boolean startImmediately;
    private SubscriptionOptionsPayPalRequest paypal;
}
