package com.jitendra.dp.usecase.strategy;

// Class represents Medicinal Treatment Strategy
public class MedicinalStrategy implements TreatmentStrategy {
    @Override
    public void getTreatment() {
        System.out.println("Medicinal Treatment");
    }
}