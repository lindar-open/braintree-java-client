package com.lindar.braintree;

import com.lindar.braintree.dependent.SimplePager;
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

    @Data
    private class PagedIterator<E> {
        private PaginatedCollection<E> paginatedCollection;
        private int pageSize;
        private int currentPage;
        private int index;
        private int totalSize;
        private List<E> items;
    }

    public static PaginatedCollection from(com.braintreegateway.PaginatedCollection paginatedCollection) {
        return ObjectsAcolyte.copy(paginatedCollection, new PaginatedCollection());
    }
}
