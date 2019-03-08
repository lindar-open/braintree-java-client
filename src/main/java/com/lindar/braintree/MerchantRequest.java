package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.util.List;

@Data
public class MerchantRequest {

    public String email;
    public String countryCodeAlpha3;
    public String companyName;
    public String scope;
    public PayPalOnlyAccountRequest payPalOnlyAccountRequest;
    public List<String> paymentMethods;
    public List<String> currencies;

    public static MerchantRequest from(com.braintreegateway.MerchantRequest merchantRequest) {
        return ObjectsAcolyte.copy(merchantRequest, new MerchantRequest());
    }
}
