package com.lindar.braintree.dependent;

import com.lindar.braintree.ModificationRequest;
import lombok.Data;

@Data
public class AddModificationRequest extends ModificationRequest {
    private String inheritedFromId;

//    public static AddModificationRequest from(com.braintreegateway.AddModificationRequest addModificationRequest ) {
//        addModificationRequest.
//        return ObjectsAcolyte.copy(addModificationRequest, new AddModificationRequest());
//    }
}