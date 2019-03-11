package com.lindar.braintree.dependent;

import com.lindar.braintree.ModificationsRequest;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

/**
 * Provides a fluent interface to build up requests around {@link Subscription
 * Subscriptions}.
 */
@Data
public class SubscriptionRequest {
    private ModificationsRequest addOnsRequest;
    private Integer billingDayOfMonth;
    private SubscriptionDescriptorRequest descriptorRequest;
    private ModificationsRequest discountsRequest;
    private Calendar firstBillingDate;
    private Boolean hasTrialPeriod;
    private String id;
    private String merchantAccountId;
    private Boolean neverExpires;
    private Integer numberOfBillingCycles;
    private SubscriptionOptionsRequest options;
    private String paymentMethodToken;
    private String paymentMethodNonce;
    private String planId;
    private BigDecimal price;
    private Integer trialDuration;
    private Subscription.DurationUnit trialDurationUnit;

//    public static SubscriptionRequest from(com.braintreegateway.SubscriptionRequest subscriptionRequest ) {
//        return ObjectsAcolyte.copy(subscriptionRequest, new SubscriptionRequest());
//    }
}
