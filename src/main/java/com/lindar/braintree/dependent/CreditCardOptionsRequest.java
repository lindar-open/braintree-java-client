package com.lindar.braintree.dependent;

import lombok.Data;

@Data
public class CreditCardOptionsRequest {
    private CreditCardRequest parent;
    private String verificationMerchantAccountId;
    private Boolean failOnDuplicatePaymentMethod;
    private Boolean verifyCard;
    private String verificationAmount;
    private Boolean makeDefault;
    private String updateExistingToken;
    private String venmoSdkSession;

//    public static CreditCardOptionsRequest from(com.braintreegateway.CreditCardOptionsRequest creditCardOptionsRequest) {
//        return ObjectsAcolyte.copy(creditCardOptionsRequest, new CreditCardOptionsRequest());
//    }
}
