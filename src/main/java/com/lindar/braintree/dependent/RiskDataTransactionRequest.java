package com.lindar.braintree.dependent;

import com.lindar.braintree.TransactionRequest;
import lombok.Data;

/**
 * Provides a fluent interface to build up requests around {@link CreditCard CreditCards}.
 */
@Data
public class RiskDataTransactionRequest {
    private String customerBrowser;
    private String customerIP;
    private TransactionRequest parent;

//    public static RiskDataTransactionRequest from(com.braintreegateway.RiskDataTransactionRequest riskDataTransactionRequest) {
//        return ObjectsAcolyte.copy(riskDataTransactionRequest, new RiskDataTransactionRequest());
//    }
}
