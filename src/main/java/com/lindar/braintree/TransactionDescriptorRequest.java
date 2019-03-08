package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class TransactionDescriptorRequest extends DescriptorRequest {
    private TransactionRequest parent;

    public static TransactionDescriptorRequest from(com.braintreegateway.TransactionDescriptorRequest transactionDescriptorRequest) {
        return ObjectsAcolyte.copy(transactionDescriptorRequest, new TransactionDescriptorRequest());
    }
}
