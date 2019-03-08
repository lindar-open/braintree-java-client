package com.lindar.braintree;


import com.lindar.braintree.enums.TransactionEscrowStatus;
import com.lindar.braintree.enums.TransactionGatewayRejectionReason;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

@Data
public class Transaction {

    private List<AddOn> addOns;
    private BigDecimal amount;
    private String avsErrorResponseCode;
    private String avsPostalCodeResponseCode;
    private String avsStreetAddressResponseCode;
    private Address billingAddress;
    private String channel;
    private Calendar createdAt;
    private CreditCard creditCard;
    private String currencyIsoCode;
    private Customer customer;
    private Map<String, String> customFields;
    private String cvvResponseCode;
    private DisbursementDetails disbursementDetails;
    private List<Dispute> disputes;
    private Descriptor descriptor;
    private List<Discount> discounts;
    private TransactionEscrowStatus escrowStatus;
    private TransactionGatewayRejectionReason gatewayRejectionReason;
    private String id;
    private String merchantAccountId;
    private String orderId;
    private PayPalDetails paypalDetails;
    private ApplePayDetails applePayDetails;
    private AndroidPayDetails androidPayDetails;
    private AmexExpressCheckoutDetails amexExpressCheckoutDetails;
    private VenmoAccountDetails venmoAccountDetails;
    private UsBankAccountDetails usBankAccountDetails;
    private IdealPaymentDetails idealPaymentDetails;
    private VisaCheckoutCardDetails visaCheckoutCardDetails;
    private MasterpassCardDetails masterpassCardDetails;
    private String planId;
    private String processorAuthorizationCode;
    private String processorResponseCode;
    private String processorResponseText;
    private ProcessorResponseType processorResponseType;
    private String processorSettlementResponseCode;
    private String processorSettlementResponseText;
    private String additionalProcessorResponse;
    private String voiceReferralNumber;
    private String purchaseOrderNumber;
    private Boolean recurring;
    private String refundedTransactionId;
    private String refundId;
    private List<String> refundIds;
    private SamsungPayCardDetails samsungPayCardDetails;
    private String settlementBatchId;
    private Address shippingAddress;
    private Status status;
    private List<StatusEvent> statusHistory;
    private String subscriptionId;
    private Subscription subscription;
    private SubscriptionDetails subscriptionDetails;
    private BigDecimal taxAmount;
    private Boolean taxExempt;
    private BigDecimal shippingAmount;
    private BigDecimal discountAmount;
    private String shipsFromPostalCode;
    private Type type;
    private Calendar updatedAt;
    private BigDecimal serviceFeeAmount;
    private String paymentInstrumentType;
    private RiskData riskData;
    private ThreeDSecureInfo threeDSecureInfo;
    private CoinbaseDetails coinbaseDetails;
    private String authorizedTransactionId;
    private List<String> partialSettlementTransactionIds;
    private List<AuthorizationAdjustment> authorizationAdjustments;
    private FacilitatedDetails facilitatedDetails;
    private FacilitatorDetails facilitatorDetails;
    private String networkTransactionId;
    private Calendar authorizationExpiresAt;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
