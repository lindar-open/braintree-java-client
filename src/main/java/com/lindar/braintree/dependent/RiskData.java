package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class RiskData {

    private String id;
    private String decision;
    private Boolean deviceDataCaptured;
    private String fraudServiceProvider;
}
