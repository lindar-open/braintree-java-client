package com.lindar.braintree.enums;

public enum TransactionType {
    CREDIT("credit"),
    SALE("sale"),
    UNRECOGNIZED("unrecognized");

    private final String name;

    TransactionType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
