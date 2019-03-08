package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

/**
 * Provides a fluent interface to build up requests around Transaction-Level Fee Reports.
 */
@Data
public class TransactionLevelFeeReportRequest {
    private String date;
    private String merchantAccountId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
