package com.gavilan.solid;

/**
 * @author Ezequiel Gavilán
 */
public class HealthInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClam() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        // Logic
        return true;
    }
}
