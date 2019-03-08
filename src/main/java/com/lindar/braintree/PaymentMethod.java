package com.lindar.braintree;

import com.lindar.braintree.dependant.Subscription;
import lindar.acolyte.util.ObjectsAcolyte;

import java.util.List;

public interface PaymentMethod {

    String getToken();
//    boolean isDefault();
    String getImageUrl();
    String getCustomerId();
    List<Subscription> getSubscriptions();
}
