package com.lindar.braintree.dependent;

import com.lindar.braintree.TransactionRequest;
import com.lindar.braintree.enums.ExternalVaultStatus;

public class ExternalVaultRequest {
    private TransactionRequest parent;
    private ExternalVaultStatus status;
    private String previousNetworkTransactionId;
}
