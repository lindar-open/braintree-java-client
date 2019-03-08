package com.lindar.braintree.dependent;

import lombok.Data;

import java.util.Calendar;

@Data
public class SubscriptionDetails {
    private Calendar billingPeriodEndDate;
    private Calendar billingPeriodStartDate;
}
