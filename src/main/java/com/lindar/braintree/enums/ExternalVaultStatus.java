package com.lindar.braintree.enums;

public enum ExternalVaultStatus {
    WILL_VAULT("will_vault"),
    VAULTED("vaulted");

    private final String name;

    ExternalVaultStatus(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}