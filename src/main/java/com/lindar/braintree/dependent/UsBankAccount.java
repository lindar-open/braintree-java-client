package com.lindar.braintree.dependent;

import com.lindar.braintree.PaymentMethod;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

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

    public static UsBankAccount from(com.braintreegateway.UsBankAccount usBankAccount) {
        UsBankAccount usBankAccountCopy = ObjectsAcolyte.copy(usBankAccount, new UsBankAccount());
        usBankAccountCopy.setSubscriptions(usBankAccount.getSubscriptions().stream().map(Subscription::from).collect(Collectors.toList()));
        usBankAccountCopy.setAchMandate(AchMandate.from(usBankAccount.getAchMandate()));
        usBankAccountCopy.setVerifications(usBankAccount.getVerifications().stream().map(UsBankAccountVerification::from).collect(Collectors.toList()));
        return usBankAccountCopy;
    }
}
