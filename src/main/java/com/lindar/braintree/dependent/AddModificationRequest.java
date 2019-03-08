package com.lindar.braintree.dependent;

import com.lindar.braintree.ModificationRequest;
import lombok.Data;

@Data
public class AddModificationRequest extends ModificationRequest {
    private String inheritedFromId;
}
