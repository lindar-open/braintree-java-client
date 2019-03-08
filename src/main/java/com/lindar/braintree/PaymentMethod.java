package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;

import java.util.List;

public interface PaymentMethod {

    String getToken();
    boolean isDefault();
    String getImageUrl();
    String getCustomerId();
    List<Subscription> getSubscriptions();

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
