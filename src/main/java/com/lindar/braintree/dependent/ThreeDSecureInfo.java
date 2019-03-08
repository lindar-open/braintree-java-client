package com.lindar.braintree.dependent;

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
}
