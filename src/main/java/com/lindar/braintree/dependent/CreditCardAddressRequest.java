package com.lindar.braintree.dependent;


import com.lindar.braintree.AddressRequest;
import lombok.Data;

@Data
public class CreditCardAddressRequest extends AddressRequest {
    private CreditCardRequest parent;

//    public static CreditCardAddressRequest from(com.braintreegateway.CreditCardAddressRequest creditCardAddressRequest) {
//        return ObjectsAcolyte.copy(creditCardAddressRequest, new CreditCardAddressRequest());
//    }
}
