package com.lindar.braintree;

import com.lindar.braintree.enums.TransactionKind;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class TransactionLineItemRequest {

    private TransactionRequest parent;
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

    public static TransactionLineItemRequest from(com.braintreegateway.TransactionLineItemRequest transactionLineItemRequest) {
        return ObjectsAcolyte.copy(transactionLineItemRequest, new TransactionLineItemRequest());
    }
}
