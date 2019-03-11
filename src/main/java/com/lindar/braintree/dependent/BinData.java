package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class BinData {
    private String commercial;
    private String countryOfIssuance;
    private String debit;
    private String durbinRegulated;
    private String healthcare;
    private String issuingBank;
    private String payroll;
    private String prepaid;
    private String productId;

    public static BinData from(com.braintreegateway.BinData binData) {
        return ObjectsAcolyte.copy(binData, new BinData());
    }
}
