package com.jitendra.dp.usecase.factorymethod;

// Testing FactoryMethod Pattern - categorized under GOF Creational Patterns
// Hospital Management System Application class demonstrate Factory method pattern use case.
// Uses the factories

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HosiptalManagementSystem {
    private static  Map<String, UserFactory> registry = Map.of(
            "admin", new AdminFactory(),
            "doctor", new DoctorFactory(),
            "patient", new PatientFactory()
    );

    public static void main(String[] args) {
       // String userType = args[0] ; //  command line argument - usertype at runtime
        String userType = "doctor";
        UserFactory factory = registry.get(userType.toLowerCase());
        if (factory != null) {
            User user = factory.create();
            user.showProfile();
        } else {
            System.out.println("Unknown user type.");
        }
    }
}
