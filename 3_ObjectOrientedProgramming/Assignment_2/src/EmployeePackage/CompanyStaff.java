package EmployeePackage;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyStaff {
    private static double totalSalary;
    private List<Employee> employeeList;

    static {
        totalSalary = 0;
    }

    public CompanyStaff(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public static double getTotalSalary() {
        return totalSalary;
    }

    public void displayInfo() {
        employeeList.forEach(employee -> {
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Rate: " + employee.getRate());
                    System.out.println("Hours: " + employee.getHours());
                    System.out.println("----------");
                }
        );
    }

    public void calculateTotalSalary() {
        totalSalary = getSalaryList()
                .stream()
                .reduce((double) 0, Double::sum);
    }

    public List<Double> getSalaryList() {
        return employeeList
                .stream()
                .map(employee -> employee.getRate() * employee.getHours())
                .collect(Collectors.toList());
    }

    public List<Double> getBonusList() {
        return getSalaryList()
                .stream()
                .map(salary -> (double) Math.round(salary * 0.1) / 100)
                .collect(Collectors.toList());
    }
}
