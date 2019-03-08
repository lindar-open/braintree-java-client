package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class IdealPaymentDetails {
    private String idealPaymentId;
    private String idealTransactionId;
    private String imageUrl;
    private String maskedIban;
    private String bic;
}
