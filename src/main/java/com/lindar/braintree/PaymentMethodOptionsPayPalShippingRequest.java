package com.lindar.braintree;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class PaymentMethodOptionsPayPalShippingRequest extends AddressRequest {

    private PaymentMethodOptionsPayPalRequest parent;

//    public static PaymentMethodOptionsPayPalShippingRequest from(com.braintreegateway.PaymentMethodOptionsPayPalShippingRequest paymentMethodOptionsPayPalShippingRequest) {
//        return ObjectsAcolyte.copy(paymentMethodOptionsPayPalShippingRequest, new PaymentMethodOptionsPayPalShippingRequest());
//    }
}
