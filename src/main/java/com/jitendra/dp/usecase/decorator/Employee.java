package com.jitendra.dp.usecase.decorator;

//Concreate Component - Employee with base salary
public class Employee implements Salary {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public double getSalary() {
        return baseSalary;
    }

    @Override
    public String getDescription() {
        return "Salary of " + name + " (basic)";
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }

}