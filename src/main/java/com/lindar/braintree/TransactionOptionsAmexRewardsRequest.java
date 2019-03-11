package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionOptionsAmexRewardsRequest {
    private TransactionOptionsRequest parent;
    private String points;
    private String currencyAmount;
    private String currencyIsoCode;
    private String requestId;

//    public static TransactionOptionsAmexRewardsRequest from(com.braintreegateway.TransactionOptionsAmexRewardsRequest transactionOptionsAmexRewardsRequest) {
//        return ObjectsAcolyte.copy(transactionOptionsAmexRewardsRequest, new TransactionOptionsAmexRewardsRequest());
//    }
}
