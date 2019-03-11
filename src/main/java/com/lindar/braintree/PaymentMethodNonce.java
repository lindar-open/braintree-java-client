package com.lindar.braintree;

import com.lindar.braintree.dependent.BinData;
import com.lindar.braintree.dependent.ThreeDSecureInfo;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PaymentMethodNonce {
    private Boolean isDefault;
    private String publicId;
    private Boolean isLocked;
    private Boolean isConsumed;
    private PaymentMethodNonceDetails details;
    private ThreeDSecureInfo threeDSecureInfo;
    private String type;
    private BinData binData;

    public static PaymentMethodNonce from(com.braintreegateway.PaymentMethodNonce paymentMethodNonce) {
        PaymentMethodNonce paymentMethodNonceCopy = ObjectsAcolyte.copy(paymentMethodNonce, new PaymentMethodNonce());
        paymentMethodNonceCopy.setDetails(PaymentMethodNonceDetails.from(paymentMethodNonce.getDetails()));
        paymentMethodNonceCopy.setThreeDSecureInfo(ThreeDSecureInfo.from(paymentMethodNonce.getThreeDSecureInfo()));
        paymentMethodNonceCopy.setBinData(BinData.from(paymentMethodNonce.getBinData()));
        return paymentMethodNonceCopy;
    }
}
