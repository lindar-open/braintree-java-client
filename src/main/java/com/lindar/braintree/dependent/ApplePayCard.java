package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class ApplePayCard implements PaymentMethod {
    private String imageUrl;
    private String token;
    private boolean isDefault;
    private String bin;
    private String cardType;
    private String paymentInstrumentName;
    private String sourceDescription;
    private String last4;
    private String expirationMonth;
    private String expirationYear;
    private boolean expired;
    private String customerId;
    private String cardholderName;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;
}
