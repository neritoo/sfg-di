package com.gavilan.solid;

/**
 * @author Ezequiel Gavilán
 */
public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor) {
        if (surveyor.isValidClam()) {
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}
