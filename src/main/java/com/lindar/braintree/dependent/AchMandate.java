package com.lindar.braintree.dependant;

import lombok.Data;

import java.util.Calendar;

@Data
public class AchMandate {
    private String text;
    private Calendar acceptedAt;
}
