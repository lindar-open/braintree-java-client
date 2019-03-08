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

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
