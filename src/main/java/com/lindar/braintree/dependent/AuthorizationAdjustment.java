package com.lindar.braintree.dependent;

import com.lindar.braintree.enums.ProcessorResponseType;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class AuthorizationAdjustment {
    private BigDecimal amount;
    private Boolean success;
    private Calendar timestamp;
    private String processorResponseCode;
    private String processorResponseText;
    private ProcessorResponseType processorResponseType;
}
