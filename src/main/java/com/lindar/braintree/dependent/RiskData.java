package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class RiskData {

    private String id;
    private String decision;
    private Boolean deviceDataCaptured;
    private String fraudServiceProvider;

    public static RiskData from(com.braintreegateway.RiskData riskData) {
        return ObjectsAcolyte.copy(riskData, new RiskData());
    }
}
