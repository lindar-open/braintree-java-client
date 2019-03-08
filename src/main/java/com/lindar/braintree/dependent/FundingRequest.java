package com.lindar.braintree.dependent;

import com.lindar.braintree.MerchantAccount;
import com.lindar.braintree.MerchantAccountRequest;
import lombok.Data;

@Data
public class FundingRequest {
    private MerchantAccount.FundingDestination destination;
    private String email;
    private String mobilePhone;
    private String routingNumber;
    private String accountNumber;
    private String descriptor;
    private MerchantAccountRequest parent;
}
