package EmployeePackage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating list of all employees
        List<Employee> employeesList = getEmployeesList();

        //Methods for a specific employee
        Employee employee = getEmployeeById(employeesList, 0);
        //Changing employees rate
        employee.changeRate(89.5);
        //Getting employees salary
        double salary = employee.getEmployeeSalary();
        //Getting employee bonus
        double bonus = employee.getEmployeeBonus(salary);
        //Display employee info
        employee.displayEmployeeInfo();


        //Display all employees info
        CompanyStaff.displayInfo(employeesList);

        //Getting all employees salary
        List<Double> salaryList = CompanyStaff.getSalaryList(employeesList);
        System.out.println("Salary list: " + salaryList);

        //Getting all employees bonuses
        List<Double> bonusList = CompanyStaff.getBonusList(salaryList);
        System.out.println("Bonus list: " + bonusList);

        //Getting salary of all employees
        System.out.println("Total salary: " + CompanyStaff.getTotalSum());

    }

    private static Employee getEmployeeById(List<Employee> employeeList, int id) {
            return employeeList.get(id);
    }

    private static List<Employee> getEmployeesList() {
        return List.of(
                new Employee(),
                new Employee("Max", 32),
                new Employee("Petya", 67, 18)
        );
    }
}
