package com.lindar.braintree.dependent;

import com.lindar.braintree.TransactionDetails;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

//final
public class Dispute {
    public enum Status {
        OPEN,
        LOST,
        WON,
        UNRECOGNIZED,
        ACCEPTED,
        DISPUTED,
        EXPIRED
    }

    public enum Reason {
        CANCELLED_RECURRING_TRANSACTION,
        CREDIT_NOT_PROCESSED,
        DUPLICATE,
        FRAUD,
        GENERAL,
        INVALID_ACCOUNT,
        NOT_RECOGNIZED,
        PRODUCT_NOT_RECEIVED,
        PRODUCT_UNSATISFACTORY,
        TRANSACTION_AMOUNT_DIFFERS,
        RETRIEVAL;
    }

    public enum Kind {
        CHARGEBACK,
        PRE_ARBITRATION,
        RETRIEVAL,
        UNRECOGNIZED;
    }

    private Calendar createdAt;
    private Calendar receivedDate;
    private Calendar replyByDate;
    private Calendar openedDate;
    private Calendar updatedAt;
    private Calendar wonDate;
    private List<DisputeEvidence> evidence;
    private List<DisputeStatusHistory> statusHistory;
    private String caseNumber;
    private String currencyIsoCode;
    private String id;
    private String forwardedComments;
    private String merchantAccountId;
    private String originalDisputeId;
    private String reasonCode;
    private String reasonDescription;
    private String referenceNumber;
    private Reason reason;
    private Status status;
    private Kind kind;
    private BigDecimal amount;
    private BigDecimal disputedAmount;
    private BigDecimal wonAmount;
    private TransactionDetails transactionDetails;
    private DisputeTransaction transaction;
}
