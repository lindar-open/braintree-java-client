package com.lindar.braintree;

import com.lindar.braintree.dependant.AddModificationRequest;
import com.lindar.braintree.dependant.SubscriptionRequest;
import com.lindar.braintree.dependant.UpdateModificationRequest;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.util.List;

@Data
public class ModificationsRequest {
    private SubscriptionRequest parent;
    private String name;
    private List<AddModificationRequest> adds;
    private List<UpdateModificationRequest> updates;
    private List<String> removeModificationIds;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}