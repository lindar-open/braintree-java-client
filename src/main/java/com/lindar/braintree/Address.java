package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

/**
 * An address can belong to:
 * <ul>
 * <li>a CreditCard as the billing address
 * <li>a Customer as an address
 * <li>a Transaction as a billing or shipping address
 * </ul>
 *
 */

@Data
public class Address {

    private String company;
    private String countryCodeAlpha2;
    private String countryCodeAlpha3;
    private String countryCodeNumeric;
    private String countryName;
    private Calendar createdAt;
    private String customerId;
    private String extendedAddress;
    private String firstName;
    private String id;
    private String lastName;
    private String locality;
    private String postalCode;
    private String region;
    private String streetAddress;
    private Calendar updatedAt;

    public static Address from(com.braintreegateway.Address address) {
        return ObjectsAcolyte.copy(address, new Address());
    }
}
