package com.lindar.braintree.enums;

public enum TransactionIndustryType {
    LODGING("lodging"),
    TRAVEL_CRUISE("travel_cruise"),
    TRAVEL_FLIGHT("travel_flight");

    private final String name;

    TransactionIndustryType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
