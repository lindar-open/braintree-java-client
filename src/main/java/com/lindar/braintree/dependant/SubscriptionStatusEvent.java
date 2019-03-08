package com.lindar.braintree.dependant;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class SubscriptionStatusEvent {
    private BigDecimal balance;
    private String currencyIsoCode;
    private String planId;
    private BigDecimal price;
    private Calendar timestamp;
    private Subscription.Source source;
    private Subscription.Status status;
    private String user;
}
