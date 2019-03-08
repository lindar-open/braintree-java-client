package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PaymentMethodAddressRequest extends AddressRequest {

    private PaymentMethodRequest parent;

    public static PaymentMethodAddressRequest from(com.braintreegateway.PaymentMethodAddressRequest paymentMethodAddressRequest) {
        return ObjectsAcolyte.copy(paymentMethodAddressRequest, new PaymentMethodAddressRequest());
    }
}
