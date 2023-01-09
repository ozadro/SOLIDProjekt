package hr.algebra.models;

import hr.algebra.Interfaces.SimpleEmployee;

public class Employee implements SimpleEmployee {

    private String firstName;

    private String lastName;

    double salaryPercent;

    public Employee(String firstName, String lastName, double percent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryPercent = salaryPercent(percent);
    }


    @Override
    public double salaryPercent(double percent) {
        return percent;
    }

    public double getSalaryPercent() {
        return salaryPercent;
    }

    @Override
    public String toString() {
      return   firstName + " " + lastName;
    }


}
