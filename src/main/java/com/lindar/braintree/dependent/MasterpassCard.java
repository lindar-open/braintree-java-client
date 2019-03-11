package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class MasterpassCard implements PaymentMethod {

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

    public static MasterpassCard from(com.braintreegateway.MasterpassCard masterpassCard) {
        MasterpassCard masterpassCardCopy = ObjectsAcolyte.copy(masterpassCard, new MasterpassCard());
        masterpassCardCopy.setBillingAddress(Address.from(masterpassCard.getBillingAddress()));
        masterpassCardCopy.setSubscriptions(masterpassCard.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        return masterpassCardCopy;
    }
}
