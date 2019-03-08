package com.lindar.braintree.dependent;

import com.lindar.braintree.Address;
import com.lindar.braintree.enums.ProcessorResponseType;
import com.lindar.braintree.enums.TransactionGatewayRejectionReason;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class CreditCardVerification {

    public enum Status {
        FAILED, GATEWAY_REJECTED, PROCESSOR_DECLINED, UNRECOGNIZED, VERIFIED
    }

    private BigDecimal amount;
    private String avsErrorResponseCode;
    private String avsPostalCodeResponseCode;
    private String avsStreetAddressResponseCode;
    private String currencyIsoCode;
    private String cvvResponseCode;
    private TransactionGatewayRejectionReason gatewayRejectionReason;
    private String processorResponseCode;
    private String processorResponseText;
    private ProcessorResponseType processorResponseType;
    private String merchantAccountId;
    private Status status;
    private String id;
    private CreditCard creditCard;
    private Address billingAddress;
    private Calendar createdAt;
    private RiskData riskData;
}
