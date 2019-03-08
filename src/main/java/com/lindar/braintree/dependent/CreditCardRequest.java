package com.lindar.braintree.dependent;

import com.lindar.braintree.CustomerRequest;
import lombok.Data;

/**
 * Provides a fluent interface to build up requests around {@link CreditCard CreditCards}.
 */
@Data
public class CreditCardRequest {
    private CreditCardAddressRequest billingAddressRequest;
    private String billingAddressId;
    private String deviceData;
    private String cardholderName;
    private String customerId;
    private String cvv;
    private String deviceSessionId;
    private String fraudMerchantId;
    private String expirationDate;
    private String expirationMonth;
    private String expirationYear;
    private String number;
    private CreditCardOptionsRequest optionsRequest;
    private CustomerRequest parent;
    private String token;
    private String paymentMethodToken;
    private String paymentMethodNonce;
    private String venmoSdkPaymentMethodCode;
}
