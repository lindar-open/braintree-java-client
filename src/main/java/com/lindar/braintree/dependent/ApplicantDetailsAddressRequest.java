package com.lindar.braintree.dependent;

import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class ApplicantDetailsAddressRequest extends AddressRequest {
    private ApplicantDetailsRequest parent;
}
