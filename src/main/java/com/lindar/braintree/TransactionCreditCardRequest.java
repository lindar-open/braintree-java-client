package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionCreditCardRequest {
    private String cardholderName;
    private String cvv;
    private String expirationDate;
    private String expirationMonth;
    private String expirationYear;
    private String number;
    private TransactionRequest parent;
    private String token;

//    public static TransactionCreditCardRequest from(com.braintreegateway.TransactionCreditCardRequest transactionCreditCardRequest) {
//        return ObjectsAcolyte.copy(transactionCreditCardRequest, new TransactionCreditCardRequest());
//    }
}
