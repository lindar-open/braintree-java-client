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

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }

}
