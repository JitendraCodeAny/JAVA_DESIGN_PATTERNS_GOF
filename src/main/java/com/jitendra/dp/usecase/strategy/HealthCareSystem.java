package com.jitendra.dp.usecase.strategy;

// Testing Strategy Pattern - categorized under GOF Behavioral patterns
// Health Care System Application class demonstrates Strategy pattern use case in Health Care System
public class HealthCareSystem {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Sundar");
        Patient patient2 = new Patient("Bharat");

        patient1.setTreatmentStrategy(new MedicinalStrategy());
        patient2.setTreatmentStrategy(new SurgicalStrategy());

        patient1.getTreatment();  // Sundar getting medicinal treatment.
        patient2.getTreatment();  // Bharat getting surgical treatment.

        // Changing strategy (treatment plan) at runtime from Medicinal to Physiotherapy
        patient1.setTreatmentStrategy(new PhysiotherapyStrategy());
        patient1.getTreatment();
    }
}

