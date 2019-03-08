package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

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
public class Descriptor {

    private String name;
    private String phone;
    private String url;

    public static Descriptor from(com.braintreegateway.Descriptor descriptor) {
        return ObjectsAcolyte.copy(descriptor, new Descriptor());
    }
}
