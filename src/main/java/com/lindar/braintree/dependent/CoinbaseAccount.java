package com.lindar.braintree.dependant;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class CoinbaseAccount implements PaymentMethod {
    private String userId;
    private String userEmail;
    private String userName;
    private String token;
    private boolean isDefault;
    private String imageUrl;
    private String customerId;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;
}
