package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class PaymentMethodRequest {
    private String paymentMethodNonce;
    private String customerId;
    private String token;
    private PaymentMethodOptionsRequest optionsRequest;
    private PaymentMethodAddressRequest billingAddressRequest;
    private String billingAddressId;
    private String deviceData;
    private String cardholderName;
    private String cvv;
    private String deviceSessionId;
    private String fraudMerchantId;
    private String expirationDate;
    private String expirationMonth;
    private String expirationYear;
    private String number;
    private String paymentMethodToken;
    private String paypalRefreshToken;
    private Boolean paypalVaultWithoutUpgrade;
    private String venmoSdkPaymentMethodCode;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
