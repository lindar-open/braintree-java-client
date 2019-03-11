package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Calendar;

@Data
public class AchMandate {
    private String text;
    private Calendar acceptedAt;

    public static AchMandate from(com.braintreegateway.AchMandate achMandate) {
        return ObjectsAcolyte.copy(achMandate, new AchMandate());
    }
}
