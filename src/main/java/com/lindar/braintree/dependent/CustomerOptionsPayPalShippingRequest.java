package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import com.lindar.braintree.CustomerOptionsPayPalRequest;
import lombok.Data;

@Data
public class CustomerOptionsPayPalShippingRequest extends AddressRequest {
    private CustomerOptionsPayPalRequest parent;
}
