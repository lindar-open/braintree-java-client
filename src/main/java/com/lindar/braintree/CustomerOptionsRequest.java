package com.lindar.braintree;

import lombok.Data;

@Data
public class CustomerOptionsRequest {
    private CustomerRequest parent;
    private CustomerOptionsPayPalRequest customerOptionsPayPalRequest;

//    public static CustomerOptionsRequest from(com.braintreegateway.CustomerOptionsRequest customerOptionsRequest) {
//        return ObjectsAcolyte.copy(customerOptionsRequest, new CustomerOptionsRequest());
//    }
}
