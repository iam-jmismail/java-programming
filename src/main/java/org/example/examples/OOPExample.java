package org.example.examples;


abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    private final double annualSalary;

    public FullTimeEmployee(String name, int id, double annualSalary) {
        super(name, id);
        this.annualSalary = annualSalary;
    }

    @Override
    double calculateSalary() {
        return annualSalary / 12;
    }

}


class PartTimeEmployee extends Employee {
    private final double salaryPerHour;
    private final double hoursWorked;


    public PartTimeEmployee(String name, int id,double salaryPerHour, double hoursWorked) {
        super(name, id);
        this.salaryPerHour = salaryPerHour;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary(){
        return this.hoursWorked * this.salaryPerHour;
    }


}

public class OOPExample {
    public static void main(String[] args) {

        FullTimeEmployee emp = new FullTimeEmployee("Emp1", 1, 67900);
        System.out.println(emp.calculateSalary());

        PartTimeEmployee emp2 = new PartTimeEmployee("Emp2", 2, 500, 64);
        System.out.println(emp2.calculateSalary());

    }
}
