package com.lindar.braintree;

import com.braintreegateway.util.NodeWrapper;
import com.braintreegateway.util.NodeWrapperFactory;
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

    public static Address to(com.braintreegateway.Address address) {
        return ObjectsAcolyte.copy(address, new Address());
    }

    public static com.braintreegateway.Address from(Address address, NodeWrapper node) {
        NodeWrapper node = NodeWrapperFactory.instance.create(/*html request..*/);

        return ObjectsAcolyte.copy(address, new com.braintreegateway.Address(node));
    }
}
