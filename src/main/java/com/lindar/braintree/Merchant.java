package com.lindar.braintree;

import com.lindar.braintree.dependant.OAuthCredentials;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;

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

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
