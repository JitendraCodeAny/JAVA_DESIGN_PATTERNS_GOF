package com.jitendra.dp.usecase.factorymethod;

// Factory class to create Doctor objects
public class DoctorFactory extends UserFactory {
    User create() {
        return new Doctor();
    }
}
