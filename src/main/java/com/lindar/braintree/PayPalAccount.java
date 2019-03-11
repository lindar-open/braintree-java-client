package com.lindar.braintree;


import com.lindar.braintree.dependent.Subscription;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PayPalAccount implements PaymentMethod {
    private String             email;
    private String             token;
    private String             billingAgreementId;
    private boolean            isDefault;
    private String             imageUrl;
    private String             payerId;
    private String             customerId;
    private Calendar           createdAt;
    private Calendar           updatedAt;
    private List<Subscription> subscriptions;

    public static PayPalAccount from(com.braintreegateway.PayPalAccount payPalAccount) {
        PayPalAccount payPalAccountCopy = ObjectsAcolyte.copy(payPalAccount, new PayPalAccount());
        payPalAccountCopy.setSubscriptions(payPalAccount.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        return payPalAccountCopy;
    }

    public static PayPalAccount from(com.braintreegateway.PaymentMethod paymentMethod) {
        PayPalAccount payPalAccountCopy = ObjectsAcolyte.copy(paymentMethod, new PayPalAccount());
        payPalAccountCopy.setSubscriptions(paymentMethod.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        return payPalAccountCopy;
    }
}
