package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

@Data
public final class DisputeStatusHistory {
    private Calendar disbursementDate;
    private Calendar effectiveDate;
    private Calendar timestamp;
    private Dispute.Status status;

    public static DisputeStatusHistory from(com.braintreegateway.DisputeStatusHistory disputeStatusHistory ) {
        return ObjectsAcolyte.copy(disputeStatusHistory, new DisputeStatusHistory());
    }
}
