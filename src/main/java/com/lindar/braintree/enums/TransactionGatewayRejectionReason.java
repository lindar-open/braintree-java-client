package com.lindar.braintree.enums;

public enum TransactionGatewayRejectionReason {
    PPLICATION_INCOMPLETE("application_incomplete"),
    AVS("avs"),
    AVS_AND_CVV("avs_and_cvv"),
    CVV("cvv"),
    DUPLICATE("duplicate"),
    FRAUD("fraud"),
    THREE_D_SECURE("three_d_secure"),
    UNRECOGNIZED("unrecognized");

    private final String name;

    TransactionGatewayRejectionReason(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
