package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lombok.Data;

import java.util.List;

@Data
public class UsBankAccount implements PaymentMethod {
    private String routingNumber;
    private String last4;
    private String accountType;
    private String accountHolderName;
    private String token;
    private String imageUrl;
    private String bankName;
    private List<Subscription> subscriptions;
    private String customerId;
    private Boolean isDefault;
    private AchMandate achMandate;
    private List<UsBankAccountVerification> verifications;
    private Boolean isVerified;
}
