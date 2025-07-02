package com.jitendra.dp.usecase.factorymethod;

// Factory class to create admin objects
public class AdminFactory extends UserFactory {
    User create() {
        return new Admin();
    }
}
