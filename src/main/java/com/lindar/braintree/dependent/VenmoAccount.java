package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

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

    public static VenmoAccount from(com.braintreegateway.VenmoAccount venmoAccount) {
        VenmoAccount venmoAccountCopy = ObjectsAcolyte.copy(venmoAccount, new VenmoAccount());
        if (!ObjectsAcolyte.objectNullOrEmpty(venmoAccount)) {
            if (venmoAccount.getSubscriptions() != null) venmoAccountCopy.setSubscriptions(venmoAccount.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        }
        return venmoAccountCopy;
    }
}

