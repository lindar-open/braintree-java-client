package com.lindar.braintree;

import com.lindar.braintree.dependent.CreditCardVerification;
import com.lindar.braintree.dependent.Subscription;
import com.lindar.braintree.dependent.UsBankAccountVerification;
import com.lindar.braintree.dependent.ValidationErrors;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.Map;

@Data
public class Result<T> {

    private UsBankAccountVerification usBankAccountVerification;
    private CreditCardVerification    creditCardVerification;
    private Transaction               transaction;
    private Subscription              subscription;
    private ValidationErrors          errors;
    private Map<String, String>       parameters;
    private String                    message;
    private T                         target;

    public static Result from(com.braintreegateway.Result result) {
        Result resultCopy = ObjectsAcolyte.copy(result, new Result());
        if (!ObjectsAcolyte.objectNullOrEmpty(result)) {
            if (result.getUsBankAccountVerification() != null) resultCopy.setUsBankAccountVerification(UsBankAccountVerification.from(result.getUsBankAccountVerification()));
            if (result.getCreditCardVerification() != null) resultCopy.setCreditCardVerification(CreditCardVerification.from(result.getCreditCardVerification()));
            if (result.getTransaction() != null) resultCopy.setTransaction(Transaction.from(result.getTransaction()));
            if (result.getSubscription() != null) resultCopy.setSubscription(Subscription.from(result.getSubscription()));
            if (result.getErrors() != null) resultCopy.setErrors(ValidationErrors.from(result.getErrors()));
        }
        return resultCopy;
    }
}