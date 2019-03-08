package com.lindar.braintree.dependent;

import com.lindar.braintree.MerchantAccount;
import lombok.Data;

@Data
public final class FundingDetails {
    private MerchantAccount.FundingDestination destination;
    private String email;
    private String mobilePhone;
    private String routingNumber;
    private String accountNumberLast4;
    private String descriptor;
}
