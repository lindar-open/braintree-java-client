package com.lindar.braintree.dependent;

import lombok.Data;

import java.util.Calendar;

@Data
public class AchMandate {
    private String text;
    private Calendar acceptedAt;
}
