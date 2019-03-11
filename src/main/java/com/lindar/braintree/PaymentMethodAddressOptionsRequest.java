package com.lindar.braintree;

import lombok.Data;

@Data
public class PaymentMethodAddressOptionsRequest {

    private PaymentMethodAddressRequest parent;
    private Boolean updateExisting;

//    public static PaymentMethodAddressOptionsRequest from(com.braintreegateway.PaymentMethodAddressOptionsRequest paymentMethodAddressOptionsRequest) {
//        return ObjectsAcolyte.copy(paymentMethodAddressOptionsRequest, new PaymentMethodAddressOptionsRequest());
//    }
}
