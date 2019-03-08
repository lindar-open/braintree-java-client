package com.lindar.braintree;

import com.lindar.braintree.dependant.CreditCardRequest;
import com.lindar.braintree.dependant.RiskDataCustomerRequest;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.util.Map;


/**
 * Provides a fluent interface to build up requests around {@link Customer Customers}.
 */
@Data
public class CustomerRequest {
    private String deviceData;
    private String company;
    private String customerId;
    private String deviceSessionId;
    private String fraudMerchantId;
    private String email;
    private String fax;
    private String firstName;
    private String id;
    private String lastName;
    private String phone;
    private String website;
    private String paymentMethodNonce;
    private String defaultPaymentMethodToken;
    private Map<String, String> customFields;
    private CreditCardRequest creditCardRequest;
    private RiskDataCustomerRequest riskDataCustomerRequest;
    private CustomerOptionsRequest optionsRequest;
    private TransactionRequest parent;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}