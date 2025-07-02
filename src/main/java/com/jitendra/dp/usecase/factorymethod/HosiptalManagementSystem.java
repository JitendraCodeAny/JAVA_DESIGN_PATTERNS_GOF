package com.jitendra.dp.usecase.factorymethod;

// Testing FactoryMethod Pattern - categorized under GOF Creational Patterns
// Hospital Management System Application class demonstrate Factory method pattern use case.
// Uses the factories

public class HosiptalManagementSystem {

    public static void main(String[] args) {
        UserFactory  doctorFactory = new DoctorFactory();
        User doctor = doctorFactory.create(); // create doctor object
        doctor.showProfile();  // show doctor profile

        UserFactory patientFactory = new PatientFactory();
        User patient = patientFactory.create(); // create patinet object
        patient.showProfile(); // show patient profile

        UserFactory adminFactory = new AdminFactory();
        User admin = adminFactory.create(); // create admin object
        admin.showProfile(); // show admin profile
    }
}
