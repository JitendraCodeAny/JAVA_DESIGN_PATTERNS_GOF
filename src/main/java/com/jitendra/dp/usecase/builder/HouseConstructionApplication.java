package com.jitendra.dp.usecase.builder;

// Testing Builder Pattern - categorized under GOF Creational Patterns
// Hospital Management System Application class demonstrate builder pattern use case.
// Uses builder and director class
public class HouseConstructionApplication {
    public static void main(String[] args) {
        // Concrete House
        HouseBuilder concreteBuilder = new ConcreteHouseBuilder();
        CivilEngineer engineer1 = new CivilEngineer(concreteBuilder);
        House concreteHouse = engineer1.buildHouse();
        System.out.println("<<< Concrete House Details >>>");
        concreteHouse.showDetails();
        System.out.println();
        // Luxury Villa
        HouseBuilder luxuryVillaBuilder = new LuxuryVillaBuilder();
        CivilEngineer engineer2 = new CivilEngineer(concreteBuilder);
        House luxuryVilla = engineer2.buildHouse();
        System.out.println("<<< LuxuryVilla Details >>>");
        luxuryVilla.showDetails();
    }
}

