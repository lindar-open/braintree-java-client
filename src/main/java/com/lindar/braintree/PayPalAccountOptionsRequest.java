package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class PayPalAccountOptionsRequest {
    private Boolean makeDefault;
    private PayPalAccountRequest parent;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
