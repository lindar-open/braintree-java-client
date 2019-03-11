package com.lindar.braintree;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Calendar;

@Data
public class TransactionIndustryDataLegRequest {

    private TransactionIndustryDataRequest parent;
    private String conjunctionTicket;
    private String exchangeTicket;
    private String couponNumber;
    private String serviceClass;
    private String carrierCode;
    private String fareBasisCode;
    private String flightNumber;
    private Calendar departureDate;
    private String departureAirportCode;
    private String departureTime;
    private String arrivalAirportCode;
    private String arrivalTime;
    private Boolean stopoverPermitted;
    private BigDecimal fareAmount;
    private BigDecimal feeAmount;
    private BigDecimal taxAmount;
    private String endorsementOrRestrictions;

//    public static TransactionIndustryDataLegRequest from(com.braintreegateway.TransactionIndustryDataLegRequest transactionIndustryDataLegRequest) {
//        return ObjectsAcolyte.copy(transactionIndustryDataLegRequest, new TransactionIndustryDataLegRequest());
//    }
}
