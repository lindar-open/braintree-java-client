package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
@Data
public abstract class DescriptorRequest {

    protected String name;
    protected String phone;
    protected String url;

    public static  to() {
        return ObjectsAcolyte.copy();
    }


}
