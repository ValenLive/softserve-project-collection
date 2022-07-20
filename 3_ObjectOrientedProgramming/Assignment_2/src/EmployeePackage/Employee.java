package EmployeePackage;

import java.util.ArrayList;

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


    public static void displayInfo(ArrayList<Employee> employeesList) {
        for (Employee employee : employeesList) {
            System.out.println("Name: " + employee.NAME);
            System.out.println("Rate: " + employee.rate);
            System.out.println("Hours: " + employee.HOURS);
            System.out.println("----------");
        }
    }

    public static double[] getSalary(ArrayList<Employee> employeesList) {
        double[] salaryArray = new double[employeesList.size()];
        int i = 0;
        for (Employee employee: employeesList) {
            salaryArray[i] = employee.rate * employee.HOURS;
            totalSum += salaryArray[i];
            i++;
        }
        return salaryArray;
    }

    public static double[] getBonus(double[] salaryArray) {
        double[] bonusArray = new double[salaryArray.length];
        int i = 0;
        for (double salary: salaryArray) {
            bonusArray[i] = salary * 0.1;
            i++;
        }
        return bonusArray;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

}
