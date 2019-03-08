package com.lindar.braintree;

import lombok.Data;

@Data
public abstract class DescriptorRequest {
    protected String name;
    protected String phone;
    protected String url;
}
