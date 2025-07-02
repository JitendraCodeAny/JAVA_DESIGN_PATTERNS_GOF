package com.jitendra.dp.usecase.builder;

// product - This class represent the House to build
public class House {
    String foundation;
    String structure;
    String roof;

    void showDetails() {
        System.out.println("Foundation - " + foundation);
        System.out.println("Structure -  " + structure);
        System.out.println("Roof - " + roof);
    }
}
