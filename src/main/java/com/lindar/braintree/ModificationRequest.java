package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ModificationRequest {

    private BigDecimal amount;
    private Integer numberOfBillingCycles;
    private ModificationsRequest parent;
    private Integer quantity;
    private Boolean neverExpires;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
