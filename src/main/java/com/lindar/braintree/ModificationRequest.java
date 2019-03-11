package com.lindar.braintree;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ModificationRequest {

    private BigDecimal amount;
    private Integer numberOfBillingCycles;
    private ModificationsRequest parent;
    private Integer quantity;
    private Boolean neverExpires;

//    public static ModificationRequest from(com.braintreegateway.ModificationRequest modificationRequest) {
//        return ObjectsAcolyte.copy(modificationRequest, new ModificationRequest());
//    }
}
