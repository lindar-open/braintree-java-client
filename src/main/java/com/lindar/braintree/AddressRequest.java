package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
/**
 * Provides a fluent interface to build up requests around {@link Address Addresses}.
 */
@Data
public class AddressRequest {

    private String countryCodeAlpha2;
    private String countryCodeAlpha3;
    private String countryCodeNumeric;
    private String countryName;
    private String extendedAddress;
    private String firstName;
    private String lastName;
    private String locality;
    private String postalCode;
    private String region;
    private String streetAddress;
    private String company;
    protected String tagName;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
