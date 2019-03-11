package com.lindar.braintree.dependent;

import com.lindar.braintree.ModificationRequest;
import lombok.Data;

@Data
public class UpdateModificationRequest extends ModificationRequest {
    private String existingId;

//    public static UpdateModificationRequest from(com.braintreegateway.UpdateModificationRequest updateModificationRequest) {
//        return ObjectsAcolyte.copy(updateModificationRequest, new UpdateModificationRequest());
//    }
}
