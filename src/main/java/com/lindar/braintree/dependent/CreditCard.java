package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class CreditCard implements PaymentMethod {
    private Address billingAddress;
    private String bin;
    private String cardholderName;
    private String cardType;
    private Calendar createdAt;
    private String customerId;
    private String customerLocation;
    private String expirationMonth;
    private String expirationYear;
    private boolean isDefault;
    private boolean isVenmoSdk;
    private boolean isExpired;
    private String imageUrl;
    private String last4;
    private String commercial;
    private String debit;
    private String durbinRegulated;
    private String healthcare;
    private String payroll;
    private String prepaid;
    private String productId;
    private String countryOfIssuance;
    private String issuingBank;
    private String uniqueNumberIdentifier;
    private List<Subscription> subscriptions;
    private String token;
    private Calendar updatedAt;
    private CreditCardVerification verification;

    public static CreditCard from(com.braintreegateway.CreditCard creditCard) {
        CreditCard creditCardCopy = ObjectsAcolyte.copy(creditCard, new CreditCard());
        if (!ObjectsAcolyte.objectNullOrEmpty(creditCard)) {
            if (creditCard.getBillingAddress() != null) {
                if (creditCard.getBillingAddress() != null) creditCardCopy.setBillingAddress(Address.from(creditCard.getBillingAddress()));
            }
            if (creditCard.getSubscriptions() != null) creditCardCopy.setSubscriptions(creditCard.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
            if (creditCard.getVerification() != null) creditCardCopy.setVerification(CreditCardVerification.from(creditCard.getVerification()));
        }
        return creditCardCopy;
    }
}
