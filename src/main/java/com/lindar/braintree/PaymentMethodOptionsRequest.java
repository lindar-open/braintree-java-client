package com.lindar.braintree;

import com.lindar.braintree.dependent.UsBankAccountVerification;
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

//    public static PaymentMethodOptionsRequest from(com.braintreegateway.PaymentMethodOptionsRequest paymentMethodOptionsRequest) {
//        return ObjectsAcolyte.copy(paymentMethodOptionsRequest, new PaymentMethodOptionsRequest());
//    }
}
