package com.jitendra.dp.usecase.strategy;

// Class represents Physiotherapy Treatment Strategy
public class PhysiotherapyStrategy implements TreatmentStrategy {
    @Override
    public void getTreatment() {
        System.out.println("Physiotherapy Treatment.");
    }
}