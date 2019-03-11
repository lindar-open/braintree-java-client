package com.lindar.braintree;

import com.lindar.braintree.dependent.CustomerOptionsPayPalShippingRequest;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class CustomerOptionsPayPalRequest {
    private CustomerOptionsRequest parent;
    private CustomerOptionsPayPalShippingRequest shipping;
    private String payeeEmail;
    private String customField;
    private String description;
    private String orderId;
    private BigDecimal amount;

//    public static CustomerOptionsPayPalRequest from(com.braintreegateway.CustomerOptionsPayPalRequest customerOptionsPayPalRequest) {
//        return ObjectsAcolyte.copy(customerOptionsPayPalRequest, new CustomerOptionsPayPalRequest());
//    }
}
