package com.lindar.braintree;

import com.lindar.braintree.dependent.Subscription;

import java.util.List;

public interface PaymentMethod {

    String getToken();
//    boolean isDefault();
    String getImageUrl();
    String getCustomerId();
    List<Subscription> getSubscriptions();
}
