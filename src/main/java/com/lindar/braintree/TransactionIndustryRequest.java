package com.lindar.braintree;

import com.braintreegateway.IndustryRequest;
import lombok.Data;

@Data
public class TransactionIndustryRequest extends IndustryRequest {
    private TransactionRequest parent;

//    public static TransactionIndustryRequest from(com.braintreegateway.TransactionIndustryRequest transactionIndustryRequest) {
//        return ObjectsAcolyte.copy(transactionIndustryRequest, new TransactionIndustryRequest());
//    }
}
