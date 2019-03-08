package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class VenmoAccount implements PaymentMethod {
    private String token;
    private String username;
    private String venmoUserId;
    private String sourceDescription;
    private String imageUrl;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;
    private String customerId;
    private Boolean isDefault;
}

