package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionIndustryRequest extends IndustryRequest {
    private TransactionRequest parent;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
