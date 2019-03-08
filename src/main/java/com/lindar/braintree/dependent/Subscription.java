package com.lindar.braintree.dependent;

import com.lindar.braintree.Descriptor;
import com.lindar.braintree.Transaction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Data
public class Subscription {

    public enum DurationUnit {
        DAY, MONTH, UNRECOGNIZED
    }

    public enum Status {
        ACTIVE("Active"),
        CANCELED("Canceled"),
        EXPIRED("Expired"),
        PAST_DUE("Past Due"),
        PENDING("Pending"),
        UNRECOGNIZED("Unrecognized");

        private final String name;

        Status(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public enum Source {
        API("api"),
        CONTROL_PANEL("control_panel"),
        RECURRING("recurring"),
        UNRECOGNIZED("unrecognized");

        private final String name;

        Source(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private ArrayList<AddOn> addOns;
    private BigDecimal balance;
    private Integer billingDayOfMonth;
    private Calendar billingPeriodEndDate;
    private Calendar billingPeriodStartDate;
    private Integer currentBillingCycle;
    private Integer daysPastDue;
    private Descriptor descriptor;
    private String description;
    private ArrayList<Discount> discounts;
    private Integer failureCount;
    private Calendar createdAt;
    private Calendar updatedAt;
    private Calendar firstBillingDate;
    private Boolean hasTrialPeriod;
    private String id;
    private String merchantAccountId;
    private boolean neverExpires;
    private BigDecimal nextBillAmount;
    private Calendar nextBillingDate;
    private BigDecimal nextBillingPeriodAmount;
    private Integer numberOfBillingCycles;
    private Calendar paidThroughDate;
    private String paymentMethodToken;
    private String planId;
    private BigDecimal price;
    private Status status;
    private List<SubscriptionStatusEvent> statusHistory;
    private List<Transaction> transactions;
    private Integer trialDuration;
    private DurationUnit trialDurationUnit;
}
