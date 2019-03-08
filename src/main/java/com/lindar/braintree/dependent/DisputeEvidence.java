package com.lindar.braintree.dependent;

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
}
