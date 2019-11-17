package com.lindar.braintree;

import com.lindar.braintree.dependent.*;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

@Data
public class Customer {

    private Calendar createdAt;
    private Calendar updatedAt;
    private String company;
    private String email;
    private String fax;
    private String firstName;
    private String id;
    private String lastName;
    private String phone;
    private String website;
    private Map<String, String> customFields;
    private List<CreditCard> creditCards;
    private List<PayPalAccount> paypalAccounts;
    private List<ApplePayCard> applePayCards;
    private List<AndroidPayCard> androidPayCards;
    private List<AmexExpressCheckoutCard> amexExpressCheckoutCards;
    private List<CoinbaseAccount> coinbaseAccounts;
    private List<VenmoAccount> venmoAccounts;
    private List<VisaCheckoutCard> visaCheckoutCards;
    private List<MasterpassCard> masterpassCards;
    private List<UsBankAccount> usBankAccounts;
    private List<SamsungPayCard> samsungPayCards;
    private List<Address> addresses;

    public static Customer from(com.braintreegateway.Customer customer) {
        Customer customerCopy = ObjectsAcolyte.copy(customer, new Customer());
        if (!ObjectsAcolyte.objectNullOrEmpty(customer)) {
            if (customer.getCreditCards() != null) customerCopy.setCreditCards(customer.getCreditCards().stream().filter(Objects::nonNull).map(CreditCard::from).collect(Collectors.toList()));
            if (customer.getPayPalAccounts() != null) customerCopy.setPaypalAccounts(customer.getPayPalAccounts().stream().filter(Objects::nonNull).map(PayPalAccount::from).collect(Collectors.toList()));
            if (customer.getApplePayCards() != null) customerCopy.setApplePayCards(customer.getApplePayCards().stream().filter(Objects::nonNull).map(ApplePayCard::from).collect(Collectors.toList()));
            if (customer.getAndroidPayCards() != null) customerCopy.setAndroidPayCards(customer.getAndroidPayCards().stream().filter(Objects::nonNull).map(AndroidPayCard::from).collect(Collectors.toList()));
            if (customer.getAmexExpressCheckoutCards() != null) customerCopy.setAmexExpressCheckoutCards(customer.getAmexExpressCheckoutCards().stream().filter(Objects::nonNull).map(AmexExpressCheckoutCard::from).collect(Collectors.toList()));
            if (customer.getCoinbaseAccounts() != null) customerCopy.setCoinbaseAccounts(customer.getCoinbaseAccounts().stream().filter(Objects::nonNull).map(CoinbaseAccount::from).collect(Collectors.toList()));
            if (customer.getVenmoAccounts() != null) customerCopy.setVenmoAccounts(customer.getVenmoAccounts().stream().filter(Objects::nonNull).map(VenmoAccount::from).collect(Collectors.toList()));
            if (customer.getVisaCheckoutCards() != null) customerCopy.setVisaCheckoutCards(customer.getVisaCheckoutCards().stream().filter(Objects::nonNull).map(VisaCheckoutCard::from).collect(Collectors.toList()));
            if (customer.getMasterpassCards() != null) customerCopy.setMasterpassCards(customer.getMasterpassCards().stream().filter(Objects::nonNull).map(MasterpassCard::from).collect(Collectors.toList()));
            if (customer.getUsBankAccounts() != null) customerCopy.setUsBankAccounts(customer.getUsBankAccounts().stream().filter(Objects::nonNull).map(UsBankAccount::from).collect(Collectors.toList()));
            if (customer.getSamsungPayCards() != null) customerCopy.setSamsungPayCards(customer.getSamsungPayCards().stream().filter(Objects::nonNull).map(SamsungPayCard::from).collect(Collectors.toList()));
            if (customer.getAddresses() != null) customerCopy.setAddresses(customer.getAddresses().stream().filter(Objects::nonNull).map(Address::from).collect(Collectors.toList()));
        }
        return customerCopy;
    }
}
