package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public class CustomerOptionsRequest {
    private CustomerRequest parent;
    private CustomerOptionsPayPalRequest customerOptionsPayPalRequest;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
