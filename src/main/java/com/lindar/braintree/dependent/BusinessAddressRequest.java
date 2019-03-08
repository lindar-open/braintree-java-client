package com.lindar.braintree.dependant;

import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class BusinessAddressRequest extends AddressRequest {
    private BusinessRequest parent;
}
