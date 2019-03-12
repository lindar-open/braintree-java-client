package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

import java.util.List;
import java.util.stream.Collectors;

@Data
public class ValidationErrors {
    private List<ValidationError> errors;
    private List<ValidationError> nestedErrors;

    public static ValidationErrors from(com.braintreegateway.ValidationErrors validationErrors) {
        ValidationErrors validationErrorsCopy = ObjectsAcolyte.copy(validationErrors, new ValidationErrors());
        validationErrorsCopy.setErrors(validationErrors.getAllValidationErrors().stream().map(ValidationError::from).collect(Collectors.toList()));
        validationErrorsCopy.setNestedErrors(validationErrors.getAllDeepValidationErrors().stream().map(ValidationError::from).collect(Collectors.toList()));
        return validationErrorsCopy;
    }
}
