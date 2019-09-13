package com.lindar.braintree;


import com.lindar.braintree.dependent.*;
import com.lindar.braintree.enums.*;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
public class Transaction {

    private List<Modification> addOns;
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
    private List<Modification> discounts;
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
    private TransactionStatus status;
    private List<StatusEvent> statusHistory;
    private String subscriptionId;
    private Subscription subscription;
    private SubscriptionDetails subscriptionDetails;
    private BigDecimal taxAmount;
    private Boolean taxExempt;
    private BigDecimal shippingAmount;
    private BigDecimal discountAmount;
    private String shipsFromPostalCode;
    private TransactionType type;
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

    public static Transaction from(com.braintreegateway.Transaction transaction) {
        Transaction transactionCopy = ObjectsAcolyte.copy(transaction, new Transaction());
        if (!ObjectsAcolyte.objectNullOrEmpty(transaction)) {
            if (transaction.getAddOns() != null) transactionCopy.setAddOns(transaction.getAddOns().stream().map(AddOn::from).collect(Collectors.toList()));
            if (transaction.getBillingAddress() != null) transactionCopy.setBillingAddress(Address.from(transaction.getBillingAddress()));
            if (transaction.getCreditCard() != null) transactionCopy.setCreditCard(CreditCard.from(transaction.getCreditCard()));
            if (transaction.getCustomer() != null) transactionCopy.setCustomer(Customer.from(transaction.getCustomer()));
            if (transaction.getDisbursementDetails() != null) transactionCopy.setDisbursementDetails(DisbursementDetails.from(transaction.getDisbursementDetails()));
            if (transaction.getDisputes() != null) transactionCopy.setDisputes(transaction.getDisputes().stream().map(Dispute::from).collect(Collectors.toList()));
            if (transaction.getDescriptor() != null) transactionCopy.setDescriptor(Descriptor.from(transaction.getDescriptor()));
            if (transaction.getDiscounts() != null) transactionCopy.setDiscounts(transaction.getDiscounts().stream().map(Discount::from).collect(Collectors.toList()));
            if (transaction.getPayPalDetails() != null) transactionCopy.setPaypalDetails(PayPalDetails.from(transaction.getPayPalDetails()));
            if (transaction.getApplePayDetails() != null) transactionCopy.setApplePayDetails(ApplePayDetails.from(transaction.getApplePayDetails()));
            if (transaction.getAndroidPayDetails() != null) transactionCopy.setAndroidPayDetails(AndroidPayDetails.from(transaction.getAndroidPayDetails()));
            if (transaction.getAmexExpressCheckoutDetails() != null) transactionCopy.setAmexExpressCheckoutDetails(AmexExpressCheckoutDetails.from(transaction.getAmexExpressCheckoutDetails()));
            if (transaction.getVenmoAccountDetails() != null) transactionCopy.setVenmoAccountDetails(VenmoAccountDetails.from(transaction.getVenmoAccountDetails()));
            if (transaction.getUsBankAccountDetails() != null) transactionCopy.setUsBankAccountDetails(UsBankAccountDetails.from(transaction.getUsBankAccountDetails()));
            if (transaction.getIdealPaymentDetails() != null) transactionCopy.setIdealPaymentDetails(IdealPaymentDetails.from(transaction.getIdealPaymentDetails()));
            if (transaction.getVisaCheckoutCardDetails() != null) transactionCopy.setVisaCheckoutCardDetails(VisaCheckoutCardDetails.from(transaction.getVisaCheckoutCardDetails()));
            if (transaction.getMasterpassCardDetails() != null) transactionCopy.setMasterpassCardDetails(MasterpassCardDetails.from(transaction.getMasterpassCardDetails()));
            if (transaction.getSamsungPayCardDetails() != null) transactionCopy.setSamsungPayCardDetails(SamsungPayCardDetails.from(transaction.getSamsungPayCardDetails()));
            if (transaction.getShippingAddress() != null) transactionCopy.setShippingAddress(Address.from(transaction.getShippingAddress()));
            if (transaction.getStatusHistory() != null) transactionCopy.setStatusHistory(transaction.getStatusHistory().stream().map(StatusEvent::from).collect(Collectors.toList()));
            if (transaction.getSubscription() != null) transactionCopy.setSubscription(Subscription.from(transaction.getSubscription()));
            if (transaction.getSubscriptionDetails() != null) transactionCopy.setSubscriptionDetails(SubscriptionDetails.from(transaction.getSubscriptionDetails()));
            if (transaction.getRiskData() != null) transactionCopy.setRiskData(RiskData.from(transaction.getRiskData()));
            if (transaction.getThreeDSecureInfo() != null) transactionCopy.setThreeDSecureInfo(ThreeDSecureInfo.from(transaction.getThreeDSecureInfo()));
            if (transaction.getCoinbaseDetails() != null) transactionCopy.setCoinbaseDetails(CoinbaseDetails.from(transaction.getCoinbaseDetails()));
            if (transaction.getAuthorizationAdjustments() != null) transactionCopy.setAuthorizationAdjustments(transaction.getAuthorizationAdjustments().stream().map(AuthorizationAdjustment::from).collect(Collectors.toList()));
            if (transaction.getFacilitatedDetails() != null) transactionCopy.setFacilitatedDetails(FacilitatedDetails.from(transaction.getFacilitatedDetails()));
            if (transaction.getFacilitatorDetails() != null) transactionCopy.setFacilitatorDetails(FacilitatorDetails.from(transaction.getFacilitatorDetails()));
        }
        return transactionCopy;
    }
}
