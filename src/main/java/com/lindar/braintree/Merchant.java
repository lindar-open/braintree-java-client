package com.lindar.braintree;

import com.lindar.braintree.dependent.OAuthCredentials;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class Merchant {

    private String id;
    private String email;
    private String companyName;
    private String countryCodeAlpha3;
    private String countryCodeAlpha2;
    private String countryCodeNumeric;
    private String countryName;
    private OAuthCredentials credentials;
    private List<MerchantAccount> merchantAccounts;

    public static Merchant from(com.braintreegateway.Merchant merchant) {
        Merchant merchantCopy = ObjectsAcolyte.copy(merchant, new Merchant());
        merchantCopy.setCredentials(OAuthCredentials.from(merchant.getCredentials()));
        merchantCopy.setMerchantAccounts(merchant.getMerchantAccounts().stream().map(MerchantAccount::from).collect(Collectors.toList()));
        return merchantCopy;
    }
}
