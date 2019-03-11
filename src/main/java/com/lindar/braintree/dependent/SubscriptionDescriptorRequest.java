package com.lindar.braintree.dependent;

import com.lindar.braintree.DescriptorRequest;
import lombok.Data;

@Data
public class SubscriptionDescriptorRequest extends DescriptorRequest {
    private SubscriptionRequest parent;

//    public static SubscriptionDescriptorRequest from(com.braintreegateway.SubscriptionDescriptorRequest subscriptionDescriptorRequest) {
//        return ObjectsAcolyte.copy(subscriptionDescriptorRequest, new SubscriptionDescriptorRequest());
//    }
}
