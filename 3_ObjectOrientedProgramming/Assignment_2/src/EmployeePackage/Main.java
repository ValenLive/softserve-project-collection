package EmployeePackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employeesList = new ArrayList<>();

        Employee employeeOne = new Employee();
        Employee employeeTwo = new Employee("Max", 12);
        Employee employeeThree = new Employee("Petya", 15, 18);

        //Creating list of all employees
        Collections.addAll(employeesList, employeeOne, employeeTwo, employeeThree);

        //Display all employees info
        Employee.displayInfo(employeesList);

        //Change rate of specific employee
        employeeOne.changeRate(5000);
        employeeTwo.changeRate(3400);
        employeeThree.changeRate(7500);

        //Storing employees salary
        double[] salaryArray = Employee.getSalary(employeesList);
        System.out.println("Salary array: " + Arrays.toString(salaryArray));

        //Getting bonuses
        double[] bonusArray = Employee.getBonus(salaryArray);
        System.out.println("Bonus array: " + Arrays.toString(bonusArray));

        //Total salary of all employees
        System.out.println("Total salary: " + Employee.getTotalSum());
    }
}
