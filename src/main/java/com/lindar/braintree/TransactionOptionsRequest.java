package com.lindar.braintree;

import lombok.Data;

@Data
public class TransactionOptionsRequest {
    private Boolean addBillingAddressToPaymentMethod;
    private Boolean holdInEscrow;
    private TransactionRequest parent;
    private Boolean storeInVault;
    private Boolean storeInVaultOnSuccess;
    private Boolean storeShippingAddressInVault;
    private Boolean submitForSettlement;
    private String venmoSdkSession;
    private String payeeId;
    private String payeeEmail;
    private Boolean skipAdvancedFraudChecking;
    private Boolean skipAvs;
    private Boolean skipCvv;
    private TransactionOptionsPayPalRequest transactionOptionsPayPalRequest;
    private TransactionOptionsAmexRewardsRequest transactionOptionsAmexRewardsRequest;
    private TransactionOptionsThreeDSecureRequest transactionOptionsThreeDSecureRequest;
    private TransactionOptionsVenmoRequest transactionOptionsVenmoRequest;

//    public static TransactionOptionsRequest from(com.braintreegateway.TransactionOptionsRequest transactionOptionsRequest) {
//        return ObjectsAcolyte.copy(transactionOptionsRequest, new TransactionOptionsRequest());
//    }
}
