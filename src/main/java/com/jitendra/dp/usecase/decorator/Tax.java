package com.jitendra.dp.usecase.decorator;

//Concrete decorator - Tax
public class Tax extends Decorator {
    private double tax;
    public Tax(Salary salary,double tax) {
        super(salary);
        this.tax = tax;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        return salary - (salary * tax);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "  after Tax Deduction";
    }
}
