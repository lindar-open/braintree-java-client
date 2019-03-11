package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

@Data
public class SubscriptionDetails {
    private Calendar billingPeriodEndDate;
    private Calendar billingPeriodStartDate;

    public static SubscriptionDetails from(com.braintreegateway.SubscriptionDetails subscriptionDetails) {
        return ObjectsAcolyte.copy(subscriptionDetails, new SubscriptionDetails());
    }
}
