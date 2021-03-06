package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;

@Data
public class PaginatedResult<T> {
    private int totalItems;
    private int pageSize;
    private List<T> currentPage;

    public static PaginatedResult from(com.braintreegateway.PaginatedResult paginatedResult) {
        return ObjectsAcolyte.copy(paginatedResult, new PaginatedResult());
    }
}
