package com.lindar.braintree;

import com.lindar.braintree.dependent.SimplePager;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

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


}
