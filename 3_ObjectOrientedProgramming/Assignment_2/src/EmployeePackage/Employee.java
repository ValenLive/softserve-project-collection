package EmployeePackage;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private final String NAME;
    private double rate;
    private final int HOURS;

    private static double totalSum;

    public Employee() {
        this("DefaultConstructorCalled", 1);
    }

    public Employee(String name, double rate) {
        this(name, rate, 1);
    }

    public Employee(String name, double rate, int hours) {
        this.NAME = name;
        this.rate = rate;
        this.HOURS = hours;
    }

    public String getNAME() {
        return NAME;
    }

    public double getRATE() {
        return rate;
    }

    public int getHOURS() {
        return HOURS;
    }

    public static double getTotalSum() {
        return totalSum;
    }


    public static void displayInfo(List<Employee> employeesList) {
        employeesList.forEach(employee -> {
                    System.out.println("Name: " + employee.NAME);
                    System.out.println("Rate: " + employee.rate);
                    System.out.println("Hours: " + employee.HOURS);
                    System.out.println("----------");
                }
        );
    }

    public static List<Double> getSalaryList(List<Employee> employeesList) {
        return employeesList
                .stream()
                .map(employee -> totalSum += employee.rate * employee.HOURS)
                .collect(Collectors.toList());
    }

    public static List<Double> getBonusList(List<Double> salaryList) {
        return salaryList
                .stream()
                .map(salary -> salary * 0.1)
                .collect(Collectors.toList());
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

}
