package com.lindar.braintree.dependent;

import com.lindar.braintree.PaginatedResult;

public interface SimplePager<T> {
    public PaginatedResult<T> getPage(int page);
}
