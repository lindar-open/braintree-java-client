package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.*;

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
}
