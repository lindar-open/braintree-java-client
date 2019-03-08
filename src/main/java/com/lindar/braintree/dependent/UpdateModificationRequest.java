package com.lindar.braintree.dependent;

import com.lindar.braintree.ModificationRequest;
import lombok.Data;

@Data
public class UpdateModificationRequest extends ModificationRequest {
    private String existingId;
}
