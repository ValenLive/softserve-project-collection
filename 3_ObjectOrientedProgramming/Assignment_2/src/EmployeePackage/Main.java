package EmployeePackage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating list of all employees
        List<Employee> employeesList = getEmployeesList();

        //Display all employees info
        Employee.displayInfo(employeesList);

        //Change rate of specific employee
        employeesList.get(0).changeRate(5000);
        employeesList.get(1).changeRate(3400);
        employeesList.get(2).changeRate(7500);

        //Storing employees salary
        List<Double> salaryList = Employee.getSalaryList(employeesList);
        System.out.println("Salary list: " + salaryList);

        //Getting bonuses
        List<Double> bonusList = Employee.getBonusList(salaryList);
        System.out.println("Bonus list: " + bonusList);

        //Total salary of all employees
        System.out.println("Total salary: " + Employee.getTotalSum());
    }

    private static List<Employee> getEmployeesList() {
        return List.of(
                new Employee(),
                new Employee("Max", 12),
                new Employee("Petya", 15, 18)
        );
    }
}
