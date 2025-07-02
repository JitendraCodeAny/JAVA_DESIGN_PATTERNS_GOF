package com.jitendra.dp.usecase.strategy;

// Class represents Surgical Treatment Strategy
public class SurgicalStrategy implements TreatmentStrategy {
    @Override
    public void getTreatment() {
        System.out.println("Surgical Treatment.");
    }
}