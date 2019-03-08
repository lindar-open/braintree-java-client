package com.lindar.braintree.enums;

public enum TransactionCreatedUsing {
    FULL_INFORMATION("full_information"),
    TOKEN("token"),
    UNRECOGNIZED("unrecognized");

    private final String name;

    TransactionCreatedUsing(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
