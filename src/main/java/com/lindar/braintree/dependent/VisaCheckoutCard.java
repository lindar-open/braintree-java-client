package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class VisaCheckoutCard implements PaymentMethod {

    private Address billingAddress;
    private String bin;
    private String callId;
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

    public static VisaCheckoutCard from(com.braintreegateway.VisaCheckoutCard visaCheckoutCard) {
        VisaCheckoutCard visaCheckoutCardCopy = ObjectsAcolyte.copy(visaCheckoutCard, new VisaCheckoutCard());
        visaCheckoutCardCopy.setBillingAddress(Address.from(visaCheckoutCard.getBillingAddress()));
        visaCheckoutCardCopy.setSubscriptions(visaCheckoutCard.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        visaCheckoutCardCopy.setVerification(CreditCardVerification.from(visaCheckoutCard.getVerification()));
        return visaCheckoutCardCopy;
    }
}
