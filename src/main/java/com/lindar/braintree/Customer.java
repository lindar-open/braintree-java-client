package com.lindar.braintree;

import com.lindar.braintree.dependent.*;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.*;

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
        return ObjectsAcolyte.copy(customer, new Customer());
    }
}
