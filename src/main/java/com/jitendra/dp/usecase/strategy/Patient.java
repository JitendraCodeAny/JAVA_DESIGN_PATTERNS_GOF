package com.jitendra.dp.usecase.strategy;

public class Patient {
    private String name;
    private TreatmentStrategy treatmentStrategy;

    public Patient(String name) {
        this.name = name;
    }

    public void setTreatmentStrategy(TreatmentStrategy treatmentStrategy) {
        this.treatmentStrategy = treatmentStrategy;
    }

    public void getTreatment() {
        if (treatmentStrategy != null) {
            System.out.print(name + "  : ");
            treatmentStrategy.getTreatment();
        } else {
            System.out.println("Treatment strategy not yet decided.");
        }
    }
}
