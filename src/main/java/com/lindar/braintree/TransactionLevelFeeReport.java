package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class TransactionLevelFeeReport {
    private List<TransactionLevelFeeReportRow> rows = new LinkedList<TransactionLevelFeeReportRow>();
    private Boolean valid;

    public static TransactionLevelFeeReport from(com.braintreegateway.TransactionLevelFeeReport transactionLevelFeeReport) {
        return ObjectsAcolyte.copy(transactionLevelFeeReport, new TransactionLevelFeeReport());
    }
}
