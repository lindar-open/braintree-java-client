package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class PaymentMethodOptionsRequest {
    private Boolean makeDefault;
    private PaymentMethodRequest parent;
    private String verificationMerchantAccountId;
    private Boolean failOnDuplicatePaymentMethod;
    private Boolean verifyCard;
    private String verificationAmount;
    private String venmoSdkSession;
    private PaymentMethodOptionsPayPalRequest paymentMethodOptionsPayPalRequest;
    private UsBankAccountVerification.VerificationMethod usBankAccountVerificationMethod;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
