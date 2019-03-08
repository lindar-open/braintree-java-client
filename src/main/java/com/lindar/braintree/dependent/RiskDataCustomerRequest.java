package com.lindar.braintree.dependent;

import com.lindar.braintree.CustomerRequest;
import lombok.Data;

/**
 * Provides a fluent interface to build up requests around {@link CreditCard CreditCards}.
 */
@Data
public class RiskDataCustomerRequest {
    private String customerBrowser;
    private String customerIP;
    private CustomerRequest parent;
}
