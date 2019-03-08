package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class BusinessAddressRequest extends AddressRequest {
    private BusinessRequest parent;
}
