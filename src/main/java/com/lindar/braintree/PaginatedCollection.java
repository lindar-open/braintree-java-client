package com.lindar.braintree;

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

    @Data
    private class PagedIterator<E> /*implements Iterator<E>*/ {
        private PaginatedCollection<E> paginatedCollection;
        private int pageSize;
        private int currentPage;
        private int index;
        private int totalSize;
        private List<E> items;

        public static  to() {
            return ObjectsAcolyte.copy();
        }

        public static com.braintreegateway. from() {
            return ObjectsAcolyte.copy();
        }
    }

    private SimplePager<T> pager;
    private int pageSize;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
