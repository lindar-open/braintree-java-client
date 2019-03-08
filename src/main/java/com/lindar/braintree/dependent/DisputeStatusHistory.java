package com.lindar.braintree.dependent;

import lombok.Data;

import java.util.Calendar;

@Data
public final class DisputeStatusHistory {
    private final Calendar disbursementDate;
    private final Calendar effectiveDate;
    private final Calendar timestamp;
    private final Dispute.Status status;
}
