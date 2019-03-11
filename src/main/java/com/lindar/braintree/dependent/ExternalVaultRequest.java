package com.lindar.braintree.dependent;

import com.lindar.braintree.TransactionRequest;
import com.lindar.braintree.enums.ExternalVaultStatus;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class ExternalVaultRequest {
    private TransactionRequest parent;
    private ExternalVaultStatus status;
    private String previousNetworkTransactionId;

//    public static ExternalVaultRequest from(com.braintreegateway.ExternalVaultRequest externalVaultRequest) {
//        return ObjectsAcolyte.copy(externalVaultRequest, new ExternalVaultRequest());
//    }
}
