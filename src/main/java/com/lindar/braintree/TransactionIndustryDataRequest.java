package com.lindar.braintree;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Data
public class TransactionIndustryDataRequest {

    private final TransactionIndustryRequest parent;
    private String folioNumber;
    private String checkInDate;
    private String checkOutDate;
    private String travelPackage;
    private String departureDate;
    private String lodgingCheckInDate;
    private String lodgingCheckOutDate;
    private String lodgingName;
    private String roomRate;
    private String passengerFirstName;
    private String passengerLastName;
    private String passengerMiddleInitial;
    private String passengerTitle;
    private Calendar issuedDate;
    private String travelAgencyName;
    private String travelAgencyCode;
    private String ticketNumber;
    private String issuingCarrierCode;
    private String customerCode;
    private BigDecimal fareAmount;
    private BigDecimal feeAmount;
    private BigDecimal taxAmount;
    private Boolean restrictedTicket;
    private List<TransactionIndustryDataLegRequest> legRequests;

    public static  to() {
        return ObjectsAcolyte.copy();
    }

    public static com.braintreegateway. from() {
        return ObjectsAcolyte.copy();
    }
}
