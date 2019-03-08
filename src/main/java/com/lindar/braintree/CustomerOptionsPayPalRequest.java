package com.lindar.braintree;

import com.braintreegateway.CustomerOptionsPayPalShippingRequest;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class CustomerOptionsPayPalRequest {
    private CustomerOptionsRequest parent;
    private CustomerOptionsPayPalShippingRequest shipping;
    private String payeeEmail;
    private String customField;
    private String description;
    private String orderId;
    private BigDecimal amount;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
