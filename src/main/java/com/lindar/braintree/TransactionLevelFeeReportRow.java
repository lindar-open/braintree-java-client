package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class TransactionLevelFeeReportRow {
    // Shared fields.
    private String merchantAccountId;
    private String transactionId;
    private String originalTransactionId;
    private String transactionType;
    private String presentmentCurrency;
    private String settlementCurrency;
    private BigDecimal settlementAmount;
    private Calendar settlementDate;
    private Calendar disbursementDate;
    private String paymentInstrument;
    private String cardBrand;
    private String cardType;
    private String first6OfCreditCard;
    private String issuingBank;
    private BigDecimal refundedAmount;
    private BigDecimal exchangeRate;
    private String orderId;
    private String acquirerReferenceNumber;
    private String cardIssuingCountry;
    private BigDecimal discount;
    private BigDecimal discountCredit;
    private BigDecimal perTransactionFee;
    private BigDecimal perTransactionFeeCredit;

    // IC+ fields.
    private String interchangeDescription;
    private String interchangeCurrency;
    private BigDecimal estInterchangeRate;
    private BigDecimal estInterchangeRateCredit;
    private BigDecimal estInterchangeFixed;
    private BigDecimal estInterchangeFixedCredit;
    private BigDecimal estInterchangeTotalAmount;
    private BigDecimal estTotalFeeAmount;
    private BigDecimal braintreeTotalAmount;

    // Flat-fee fields.
    private BigDecimal originalSaleAmount;
    private String refundType;
    private BigDecimal multicurrencyFeeAmount;
    private BigDecimal multicurrencyFeeCredit;
    private BigDecimal totalFeeAmount;

    public static TransactionLevelFeeReportRow from(com.braintreegateway.TransactionLevelFeeReportRow transactionLevelFeeReportRow) {
        return ObjectsAcolyte.copy(transactionLevelFeeReportRow, new TransactionLevelFeeReportRow());
    }
}
