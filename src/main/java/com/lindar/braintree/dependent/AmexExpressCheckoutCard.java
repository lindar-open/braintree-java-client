package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

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

    public static AmexExpressCheckoutCard from(com.braintreegateway.AmexExpressCheckoutCard amexExpressCheckoutCard ) {
        AmexExpressCheckoutCard amexExpressCheckoutCardCopy = ObjectsAcolyte.copy(amexExpressCheckoutCard, new AmexExpressCheckoutCard());
        amexExpressCheckoutCardCopy.setSubscriptions(amexExpressCheckoutCard.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        amexExpressCheckoutCardCopy.setIsDefault(amexExpressCheckoutCard.isDefault());
        return amexExpressCheckoutCardCopy;
    }
}
