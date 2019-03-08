package com.lindar.braintree;

import com.braintreegateway.Pager;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;

@Data
public class TransactionPager implements Pager<Transaction> {
    private TransactionGateway gateway;
    private TransactionSearchRequest query;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();

}
