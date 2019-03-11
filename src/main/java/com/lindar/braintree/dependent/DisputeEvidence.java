package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

@Data
public final class DisputeEvidence {

    private Calendar createdAt;
    private Calendar sentToProcessorAt;
    private String comment;
    private String id;
    private String url;
    private String category;
    private String sequenceNumber;

    public static DisputeEvidence from(com.braintreegateway.DisputeEvidence disputeEvidence) {
        return ObjectsAcolyte.copy(disputeEvidence, new DisputeEvidence());
    }
}
