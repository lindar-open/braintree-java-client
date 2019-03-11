package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class IndividualAddressRequest extends AddressRequest {
    private IndividualRequest parent;

//    public static IndividualAddressRequest from(com.braintreegateway.IndividualAddressRequest individualAddressRequest) {
//        return ObjectsAcolyte.copy(individualAddressRequest, new IndividualAddressRequest());
//    }
}
