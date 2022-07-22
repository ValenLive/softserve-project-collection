package EmployeePackage;

public class Employee {
    private final String NAME;
    private double rate;
    private final int HOURS;


    public Employee() {
        this("Stepan", 12);
    }


    public Employee(String name, double rate) {
        this(name, rate, 18);
    }

    public Employee(String name, double rate, int hours) {
        this.NAME = name;
        this.rate = rate;
        this.HOURS = hours;
    }

    public String getName() {
        return NAME;
    }

    public double getRate() {
        return rate;
    }

    public int getHours() {
        return HOURS;
    }


    public void changeRate(double rate) {
        this.rate = rate;
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + NAME);
        System.out.println("Rate: " + rate);
        System.out.println("Hours: " + HOURS);
        System.out.println("----------");
    }

    public double getEmployeeSalary() {
        return rate * HOURS;
    }

    public double getEmployeeBonus(double salary) {
        return salary * 0.1;
    }




}
