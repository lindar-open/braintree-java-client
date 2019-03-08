package com.lindar.braintree.dependant;

import com.lindar.braintree.MerchantAccountRequest;
import lombok.Data;

@Data
public class BusinessRequest {
    private String dbaName;
    private String legalName;
    private BusinessAddressRequest address;
    private String taxId;
    private MerchantAccountRequest parent;
}
