package com.lindar.braintree.dependant;

import com.lindar.braintree.ModificationsRequest;
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

}
