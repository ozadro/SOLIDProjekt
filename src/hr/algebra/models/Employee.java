package hr.algebra.models;

public class Employee {

    private String firstName;

    private String lastName;

    private double salaryPercent;

    public Employee(String firstName, String lastName, double salaryPercent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this. salaryPercent = salaryPercent;
    }


    public double getSalaryPercent() {
        return salaryPercent;
    }

    @Override
    public String toString() {
      return   firstName + " " + lastName;
    }


}
