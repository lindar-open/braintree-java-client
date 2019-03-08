package com.lindar.braintree;

import com.lindar.braintree.enums.TransactionKind;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TransactionLineItem {
    private BigDecimal quantity;
    private String name;
    private String description;
    private TransactionKind kind;
    private BigDecimal unitAmount;
    private BigDecimal unitTaxAmount;
    private BigDecimal totalAmount;
    private BigDecimal discountAmount;
    private String unitOfMeasure;
    private String productCode;
    private String commodityCode;
    private String url;
    private BigDecimal taxAmount;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
