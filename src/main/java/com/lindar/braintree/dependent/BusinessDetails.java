package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import lombok.Data;

@Data
public final class BusinessDetails {
    private String dbaName;
    private String legalName;
    private String taxId;
    private Address address;
}
