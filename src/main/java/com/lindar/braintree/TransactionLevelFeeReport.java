package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.LinkedList;
import java.util.List;

@Data
public class TransactionLevelFeeReport {
    private List<TransactionLevelFeeReportRow> rows = new LinkedList<TransactionLevelFeeReportRow>();
    private Boolean valid;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
