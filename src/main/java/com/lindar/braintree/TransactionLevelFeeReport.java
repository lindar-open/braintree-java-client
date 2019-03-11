package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class TransactionLevelFeeReport {
    private List<TransactionLevelFeeReportRow> rows = new LinkedList<TransactionLevelFeeReportRow>();
    private Boolean valid;

    public static TransactionLevelFeeReport from(com.braintreegateway.TransactionLevelFeeReport transactionLevelFeeReport) {
        TransactionLevelFeeReport transactionLevelFeeReportCopy = ObjectsAcolyte.copy(transactionLevelFeeReport, new TransactionLevelFeeReport());
        transactionLevelFeeReportCopy.setRows(transactionLevelFeeReport.getRows().stream().map(TransactionLevelFeeReportRow::from).collect(Collectors.toList()));
        return transactionLevelFeeReportCopy;
    }
}
