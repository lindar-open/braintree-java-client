package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class BusinessAddressRequest extends AddressRequest {
    private BusinessRequest parent;

//    public static BusinessAddressRequest from(com.braintreegateway.BusinessAddressRequest businessAddressRequest) {
//        return ObjectsAcolyte.copy(businessAddressRequest, new BusinessAddressRequest());
//    }
}
