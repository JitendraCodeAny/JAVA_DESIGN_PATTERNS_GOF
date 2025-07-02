package com.jitendra.dp.usecase.decorator;

/* Testing Decorator Pattern - categorized under GOF Structural Patterns
    Payroll Management System Application class demonstrate Decorator method design pattern use case.
    Uses component Employee and decorators Bonus, HRA, Tax
    Decorator applied dynamically to components at runtime
*/

public class PayrollManagementSystem {
    public static void main(String[] args) {

        //Employee 'Sundar' with basic salary, bonus, HRA and Tax deduction
        Salary basicSalary = new Employee("Sundar", 100000);
        Salary withBonus = new Bonus(basicSalary, 10000);
        Salary withBonusHRA = new HRA(withBonus, 5000);
        Salary withBonusHRATaxDeduction = new Tax(withBonusHRA,0.10);

        //Total salary
        double totalSalary = withBonusHRATaxDeduction.calculateSalary();
        // Show total salary with breakup of employee 'Sundar'
         System.out.println("Salary Breakup: " + withBonusHRATaxDeduction.getDescription());
        System.out.println("Total Salary: " + totalSalary);
        System.out.println();

        //Employee 'Bharat'  with basic salary, HRA and Tax deduction
        basicSalary = new Employee("Bharat", 120000);
        Salary withHRA = new HRA(basicSalary, 10000);
        Salary withHRATaxDeduction = new Tax(withHRA,0.10);

        //Total salary
         totalSalary = withHRATaxDeduction.calculateSalary();
        // Show total salary with breakup of employee 'Bharat'
        System.out.println("Salary Breakup: " + withHRATaxDeduction.getDescription());
        System.out.println("Total Salary: " + totalSalary);
    }
}
