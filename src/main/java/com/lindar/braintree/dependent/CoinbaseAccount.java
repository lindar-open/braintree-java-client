package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class CoinbaseAccount implements PaymentMethod {
    private String userId;
    private String userEmail;
    private String userName;
    private String token;
    private boolean isDefault;
    private String imageUrl;
    private String customerId;
    private Calendar createdAt;
    private Calendar updatedAt;
    private List<Subscription> subscriptions;

    public static CoinbaseAccount from(com.braintreegateway.CoinbaseAccount coinbaseAccount) {
        CoinbaseAccount coinbaseAccountCopy = ObjectsAcolyte.copy(coinbaseAccount, new CoinbaseAccount());
        if (!ObjectsAcolyte.objectNullOrEmpty(coinbaseAccount)) {
            if (coinbaseAccount.getSubscriptions() != null) coinbaseAccountCopy.setSubscriptions(coinbaseAccount.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        }
        return coinbaseAccountCopy;
    }
}
