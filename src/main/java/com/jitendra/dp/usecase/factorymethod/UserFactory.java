package com.jitendra.dp.usecase.factorymethod;

// Abstract factory class for creating hospital user objects
public abstract class UserFactory {
    abstract User create();  // Factory method to be implemented by concrete factories
}
