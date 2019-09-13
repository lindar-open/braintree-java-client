package com.lindar.braintree;


import com.lindar.braintree.dependent.Subscription;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class UnknownPaymentMethod implements PaymentMethod {
    private String             token;
    private String             customerId;
    private boolean            isDefault;
    private String             imageUrl;
    private List<Subscription> subscriptions;

    public static UnknownPaymentMethod from(com.braintreegateway.UnknownPaymentMethod unknownPaymentMethod) {
        UnknownPaymentMethod unknownPaymentMethodCopy = ObjectsAcolyte.copy(unknownPaymentMethod, new UnknownPaymentMethod());
        if (!ObjectsAcolyte.objectNullOrEmpty(unknownPaymentMethod)) {
            if (unknownPaymentMethod.getSubscriptions() != null) unknownPaymentMethodCopy.setSubscriptions(unknownPaymentMethod.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        }
        return unknownPaymentMethodCopy;
    }

    public static UnknownPaymentMethod from(com.braintreegateway.PaymentMethod unknownPaymentMethod) {
        UnknownPaymentMethod unknownPaymentMethodCopy = ObjectsAcolyte.copy(unknownPaymentMethod, new UnknownPaymentMethod());
        if (!ObjectsAcolyte.objectNullOrEmpty(unknownPaymentMethod)) {
            if (unknownPaymentMethod.getSubscriptions() != null) unknownPaymentMethodCopy.setSubscriptions(unknownPaymentMethod.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        }
        return unknownPaymentMethodCopy;
    }
}
