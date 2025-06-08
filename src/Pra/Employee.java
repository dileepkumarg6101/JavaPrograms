package Pra;

public class Employee {
    private String employeName;
    private double salary;
    public  Employee(String name, double salary) {
        this.employeName = name;
        this.salary = salary;
    }
    public String getEmployeName() {
        return employeName;
    }
    public double getSalary() {
        return salary;
    }

}
