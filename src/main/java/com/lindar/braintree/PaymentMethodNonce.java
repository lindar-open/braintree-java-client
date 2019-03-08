package com.lindar.braintree;

import com.lindar.braintree.dependant.BinData;
import com.lindar.braintree.dependant.ThreeDSecureInfo;
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

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
