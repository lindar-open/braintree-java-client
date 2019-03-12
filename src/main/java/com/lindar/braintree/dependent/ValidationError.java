package com.lindar.braintree.dependent;

import com.lindar.braintree.enums.ValidationErrorCode;
import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

/**
 * Represents an validation error from the gateway.
 */
@Data
public class ValidationError {
    private String attribute;
    private ValidationErrorCode code;
    private String message;

    public static ValidationError from(com.braintreegateway.ValidationError validationError) {
        return ObjectsAcolyte.copy(validationError, new ValidationError());
    }
}
