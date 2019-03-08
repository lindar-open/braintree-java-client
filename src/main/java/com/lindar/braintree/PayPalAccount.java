package com.lindar.braintree;


import com.lindar.braintree.dependant.Subscription;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;

@Data
public class PayPalAccount implements PaymentMethod {
    private String email;
    private String token;
    private String billingAgreementId;
    private boolean isDefault;
    private String imageUrl;
    private String payerId;
    private String customerId;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
