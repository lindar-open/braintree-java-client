package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionApplePayCardRequest {
    private String number;
    private String cardholderName;
    private String cryptogram;
    private String expirationMonth;
    private String expirationYear;
    private String eciIndicator;
    private TransactionRequest parent;

//    public static TransactionApplePayCardRequest from(com.braintreegateway.TransactionApplePayCardRequest transactionApplePayCardRequest) {
//        return ObjectsAcolyte.copy(transactionApplePayCardRequest, new TransactionApplePayCardRequest());
//    }
}
