package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class PayPalAccountOptionsRequest {
    private Boolean makeDefault;
    private PayPalAccountRequest parent;

    public static PayPalAccountOptionsRequest from(com.braintreegateway.PayPalAccountOptionsRequest payPalAccountOptionsRequest) {
        return ObjectsAcolyte.copy(payPalAccountOptionsRequest, new PayPalAccountOptionsRequest());
    }
}
