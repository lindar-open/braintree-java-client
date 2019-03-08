package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class TransactionOptionsAmexRewardsRequest {
    private TransactionOptionsRequest parent;
    private String points;
    private String currencyAmount;
    private String currencyIsoCode;
    private String requestId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

}
