package com.lindar.braintree;

import com.lindar.braintree.dependent.AddModificationRequest;
import com.lindar.braintree.dependent.SubscriptionRequest;
import com.lindar.braintree.dependent.UpdateModificationRequest;
import lombok.Data;
import java.util.List;

@Data
public class ModificationsRequest {
    private SubscriptionRequest parent;
    private String name;
    private List<AddModificationRequest> adds;
    private List<UpdateModificationRequest> updates;
    private List<String> removeModificationIds;

//    public static ModificationsRequest from(com.braintreegateway.ModificationsRequest modificationsRequest) {
//        return ObjectsAcolyte.copy(modificationsRequest, new ModificationsRequest());
//    }
}
