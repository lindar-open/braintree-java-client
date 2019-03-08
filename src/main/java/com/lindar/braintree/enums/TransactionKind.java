package com.lindar.braintree.enums;

public enum TransactionKind {
    DEBIT("debit"),
    CREDIT("credit"),
    UNRECOGNIZED("unrecognized");

    private final String name;

    TransactionKind(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
