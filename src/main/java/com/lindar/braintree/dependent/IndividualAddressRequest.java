package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class IndividualAddressRequest extends AddressRequest {
    private IndividualRequest parent;
}
