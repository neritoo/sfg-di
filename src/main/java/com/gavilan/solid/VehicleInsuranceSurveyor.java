package com.gavilan.solid;

/**
 * @author Ezequiel Gavilán
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClam() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        // Logic
        return true;
    }
}
