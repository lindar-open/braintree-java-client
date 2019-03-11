package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class DisbursementDetails {
    private Calendar disbursementDate;
    private String settlementCurrencyIsoCode;
    private boolean fundsHeld;
    private boolean success;
    private BigDecimal settlementCurrencyExchangeRate;
    private BigDecimal settlementAmount;

    public static DisbursementDetails from(com.braintreegateway.DisbursementDetails disbursementDetails) {
        return ObjectsAcolyte.copy(disbursementDetails, new DisbursementDetails());
    }
}
