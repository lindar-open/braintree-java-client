package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PayPalDetails {
    private String payerEmail;
    private String paymentId;
    private String authorizationId;
    private String token;
    private String imageUrl;
    private String debugId;
    private String payeeId;
    private String payeeEmail;
    private String customField;
    private String payerId;
    private String payerFirstName;
    private String payerLastName;
    private String payerStatus;
    private String sellerProtectionStatus;
    private String captureId;
    private String refundId;
    private String transactionFeeAmount;
    private String transactionFeeCurrencyIsoCode;
    private String description;

    public static PayPalDetails from(com.braintreegateway.PayPalDetails payPalDetails) {
        return ObjectsAcolyte.copy(payPalDetails, new PayPalDetails());
    }
}
