package model;

public class Employee {
    private int employeeNumber;
    private String name;

    public Employee() {
    }

    public Employee(int employeeNumber, String name) {
        this.employeeNumber = employeeNumber;
        this.name = name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
