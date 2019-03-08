package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class PaymentMethodOptionsPayPalRequest {
    private PaymentMethodOptionsRequest parent;
    private PaymentMethodOptionsPayPalShippingRequest shipping;
    private String payeeEmail;
    private String customField;
    private String description;
    private String orderId;
    private BigDecimal amount;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
