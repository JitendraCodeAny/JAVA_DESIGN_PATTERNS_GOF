package com.jitendra.dp.usecase.decorator;

// Abstract decorator
public abstract class Decorator implements Salary {
    Salary salary;

    public Decorator(Salary salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary.getSalary();
    }

    @Override
    public String getDescription() {
        return salary.getDescription();
    }

    @Override
    public double calculateSalary() {
        return salary.calculateSalary();
    }
}