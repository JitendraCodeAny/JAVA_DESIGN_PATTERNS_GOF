package com.jitendra.dp.usecase.factorymethod;

// Factory class to create Patient objects
public class PatientFactory extends UserFactory {
    User create() {
        return new Patient();
    }
}
