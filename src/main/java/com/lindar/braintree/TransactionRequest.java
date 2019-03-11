package com.lindar.braintree;

import com.lindar.braintree.dependent.ExternalVaultRequest;
import com.lindar.braintree.dependent.RiskDataTransactionRequest;
import com.lindar.braintree.enums.TransactionType;
import lombok.Data;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Provides a fluent interface to build up requests around {@link Transaction Transactions}.
 */
@Data
public class TransactionRequest {
    private BigDecimal amount;
    private TransactionAddressRequest billingAddressRequest;
    private String deviceData;
    private TransactionCreditCardRequest creditCardRequest;
    private TransactionPayPalRequest paypalRequest;
    private String channel;
    private String customerId;
    private String deviceSessionId;
    private String fraudMerchantId;
    private CustomerRequest customerRequest;
    private Map<String, String> customFields;
    private String merchantAccountId;
    private String orderId;
    private String paymentMethodToken;
    private String purchaseOrderNumber;
    private Boolean recurring;
    private String source;
    private String shippingAddressId;
    private String billingAddressId;
    private TransactionApplePayCardRequest applePayCardRequest;
    private TransactionDescriptorRequest descriptorRequest;
    private TransactionIndustryRequest industryRequest;
    private TransactionAddressRequest shippingAddressRequest;
    private TransactionOptionsRequest transactionOptionsRequest;
    private TransactionThreeDSecurePassThruRequest threeDSecurePassThruRequest;
    private BigDecimal taxAmount;
    private Boolean taxExempt;
    private BigDecimal shippingAmount;
    private BigDecimal discountAmount;
    private String shipsFromPostalCode;
    private TransactionType type;
    private String venmoSdkPaymentMethodCode;
    private String paymentMethodNonce;
    private BigDecimal serviceFeeAmount;

    private String threeDSecureToken;
    private Boolean threeDSecureTransaction;

    private String sharedPaymentMethodToken;
    private String sharedPaymentMethodNonce;
    private String sharedCustomerId;
    private String sharedShippingAddressId;
    private String sharedBillingAddressId;

    private RiskDataTransactionRequest riskDataTransactionRequest;
    private List<TransactionLineItemRequest> transactionLineItemRequests;
    private ExternalVaultRequest externalVaultRequest;

//    public static TransactionRequest from(com.braintreegateway.TransactionRequest transactionRequest) {
//        return ObjectsAcolyte.copy(transactionRequest, new TransactionRequest());
//    }
}
