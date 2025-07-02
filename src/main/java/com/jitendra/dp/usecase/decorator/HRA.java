package com.jitendra.dp.usecase.decorator;

//Concrete decorator - House Rent Allowance
public class HRA extends Decorator {
    private double allowance;

    public HRA(Salary salary, double allowance) {
        super(salary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with HRA";
    }
}
