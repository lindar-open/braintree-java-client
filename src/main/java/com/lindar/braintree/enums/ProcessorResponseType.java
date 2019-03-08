package com.lindar.braintree.enums;

/**
 * An Enum representing all of the processor response types from the gateway
 * that are present on Transaction, AuthorizationAdjustment and
 * CreditCardVerification.
 */
public enum ProcessorResponseType {
    APPROVED,
    SOFT_DECLINED,
    HARD_DECLINED,
    UNRECOGNIZED
}
