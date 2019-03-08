package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Modification {
    private BigDecimal amount;
    private Integer currentBillingCycle;
    private String description;
    private String id;
    private String kind;
    private Integer quantity;
    private String name;
    private Boolean neverExpires;
    private Integer numberOfBillingCycles;
    private String planId;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
