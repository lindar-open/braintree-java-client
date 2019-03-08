package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;

@Data
private class PagedIterator<E> {
    private PaginatedCollection<E> paginatedCollection;
    private int pageSize;
    private int currentPage;
    private int index;
    private int totalSize;
    private List<E> items;

    public static  to() {
        return ObjectsAcolyte.copy();
    }
}