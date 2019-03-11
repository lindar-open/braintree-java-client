package com.lindar.braintree;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TransactionAddressRequest extends AddressRequest {
    private TransactionRequest parent;

//    public static TransactionAddressRequest from(com.braintreegateway.TransactionAddressRequest transactionAddressRequest) {
//        return ObjectsAcolyte.copy(transactionAddressRequest, new TransactionAddressRequest());
//    }
}
