package com.lindar.braintree.dependent;

import com.lindar.braintree.enums.TransactionGatewayRejectionReason;

import java.util.Calendar;

public class UsBankAccountVerification {

    public enum Status {
        FAILED("failed"),
        GATEWAY_REJECTED("gateway_rejected"),
        PROCESSOR_DECLINED("processor_declined"),
        UNRECOGNIZED("unrecognized"),
        VERIFIED("verified"),
        PENDING("pending");

        private String name;

        Status(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public enum VerificationMethod {
        TOKENIZED_CHECK("tokenized_check"),
        NETWORK_CHECK("network_check"),
        INDEPENDENT_CHECK("independent_check"),
        UNRECOGNIZED("unrecognized"),
        MICRO_TRANSFERS("micro_transfers");

        private String name;

        VerificationMethod(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    private String id;
    private Status status;
    private VerificationMethod verificationMethod;
    private String processorResponseCode;
    private String processorResponseText;
    private Calendar verificationDeterminedAt;
    private Calendar createdAt;
    private TransactionGatewayRejectionReason gatewayRejectionReason;
    private UsBankAccount usBankAccount;
}
