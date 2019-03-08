package com.lindar.braintree.dependant;

import com.lindar.braintree.ModificationRequest;
import lombok.Data;

@Data
public class AddModificationRequest extends ModificationRequest {
    private String inheritedFromId;
}
