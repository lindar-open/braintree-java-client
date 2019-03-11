package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import com.lindar.braintree.CustomerOptionsPayPalRequest;
import lombok.Data;

@Data
public class CustomerOptionsPayPalShippingRequest extends AddressRequest {
    private CustomerOptionsPayPalRequest parent;

//    public static CustomerOptionsPayPalShippingRequest from(com.braintreegateway.CustomerOptionsPayPalShippingRequest customerOptionsPayPalShippingRequest) {
//        return ObjectsAcolyte.copy(customerOptionsPayPalShippingRequest, new CustomerOptionsPayPalShippingRequest());
//    }
}
