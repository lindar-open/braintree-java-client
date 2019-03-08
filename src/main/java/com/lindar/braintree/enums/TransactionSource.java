package com.lindar.braintree.enums;

public enum TransactionSource {
    API("api"),
    CONTROL_PANEL("control_panel"),
    RECURRING("recurring"),
    UNRECOGNIZED("unrecognized");

    private final String name;

    TransactionSource(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
