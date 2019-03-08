package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
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


    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
