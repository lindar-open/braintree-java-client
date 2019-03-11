package com.lindar.braintree.dependent;

import com.lindar.braintree.MerchantAccountRequest;
import lombok.Data;

@Data
public class BusinessRequest {
    private String dbaName;
    private String legalName;
    private BusinessAddressRequest address;
    private String taxId;
    private MerchantAccountRequest parent;

//    public static BusinessRequest from(com.braintreegateway.BusinessRequest businessRequest) {
//        return ObjectsAcolyte.copy(businessRequest, new BusinessRequest());
//    }
}
