package com.lindar.braintree;

import com.braintreegateway.util.Http;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import javax.security.auth.login.Configuration;

/**
 * Provides methods to interact with {@link TransactionLineItem TransactionLineItems}.
 * This class does not need to be instantiated directly.
 * Instead, use {@link BraintreeGateway#transactionLineItem()} to get an instance of this class:
 *
 * <pre>
 * BraintreeGateway gateway = new BraintreeGateway(...);
 * gateway.transactionLineItem().findAll(...)
 * </pre>
 */
@Data
public class TransactionLineItemGateway {

    private Http http;
    private Configuration configuration;


    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
}
