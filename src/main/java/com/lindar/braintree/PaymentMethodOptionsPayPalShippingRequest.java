package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PaymentMethodOptionsPayPalShippingRequest extends AddressRequest {

    private PaymentMethodOptionsPayPalRequest parent;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
