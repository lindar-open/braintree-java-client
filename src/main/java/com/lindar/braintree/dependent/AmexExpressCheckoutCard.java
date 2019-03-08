package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class AmexExpressCheckoutCard implements PaymentMethod {
    private String cardType;
    private String token;
    private String bin;
    private String expirationMonth;
    private String expirationYear;
    private String cardMemberNumber;
    private String cardMemberExpiryDate;
    private String sourceDescription;
    private Boolean isDefault;
    private String imageUrl;
    private String customerId;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;
}
