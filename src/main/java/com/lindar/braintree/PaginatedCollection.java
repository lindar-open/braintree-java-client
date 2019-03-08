package com.lindar.braintree;

import com.lindar.braintree.dependant.SimplePager;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;

/**
 * A collection used to page through results.
 *
 * @param <T>
 *            type of object being paged, e.g. {@link MerchantAccount}
 */
@Data
public class PaginatedCollection<T> /*implements Iterable<T>*/ {

    private SimplePager<T> pager;
    private int pageSize;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
