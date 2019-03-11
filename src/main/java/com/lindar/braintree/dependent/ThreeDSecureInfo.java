package com.lindar.braintree.dependent;

import lindar.acolyte.util.ObjectsAcolyte;
import lombok.Data;

@Data
public class ThreeDSecureInfo {
    private boolean liabilityShifted;
    private boolean liabilityShiftPossible;
    private String enrolled;
    private String status;
    private String cavv;
    private String eciFlag;
    private String xid;
    private String threeDSecureVersion;

    public static ThreeDSecureInfo from(com.braintreegateway.ThreeDSecureInfo threeDSecureInfo) {
        return ObjectsAcolyte.copy(threeDSecureInfo, new ThreeDSecureInfo());
    }
}
