package com.lindar.braintree.dependent;

import com.lindar.braintree.enums.TransactionSource;
import com.lindar.braintree.enums.TransactionStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class StatusEvent {
    private BigDecimal amount;
    private TransactionStatus status;
    private Calendar timestamp;
    private TransactionSource source;
    private String user;
}
