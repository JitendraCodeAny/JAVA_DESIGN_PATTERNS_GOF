package com.jitendra.dp.usecase.decorator;

//Concrete decorator - Bonus
public class Bonus extends Decorator {
    private double bonusAmount;

    public Bonus(Salary salary, double bonusAmount) {
        super(salary);
        this.bonusAmount = bonusAmount;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonusAmount;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Bonus";
    }
}
