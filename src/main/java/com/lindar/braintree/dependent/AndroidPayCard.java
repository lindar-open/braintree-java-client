package com.lindar.braintree.dependant;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class AndroidPayCard implements PaymentMethod {
    private String cardType;
    private String last4;
    private String sourceCardType;
    private String sourceCardLast4;
    private String sourceDescription;
    private String virtualCardType;
    private String virtualCardLast4;
    private String expirationMonth;
    private String expirationYear;
    private String token;
    private String googleTransactionId;
    private String bin;
    private Boolean isDefault;
    private String imageUrl;
    private String customerId;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;
}
