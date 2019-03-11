package com.lindar.braintree.dependent;

import com.lindar.braintree.CustomerRequest;
import lombok.Data;

/**
 * Provides a fluent interface to build up requests around {@link CreditCard CreditCards}.
 */
@Data
public class RiskDataCustomerRequest {
    private String customerBrowser;
    private String customerIP;
    private CustomerRequest parent;

//    public static RiskDataCustomerRequest from(com.braintreegateway.RiskDataCustomerRequest riskDataCustomerRequest) {
//        IndividualRequest riskDataCustomerRequestCopy = ObjectsAcolyte.copy(riskDataCustomerRequest, new RiskDataCustomerRequest());
//        riskDataCustomerRequestCopy.setAddress(IndividualAddressRequest.from(riskDataCustomerRequest.address()));
//    }
}
