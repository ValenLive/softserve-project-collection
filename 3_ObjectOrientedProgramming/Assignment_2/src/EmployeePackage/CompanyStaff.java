package EmployeePackage;

import java.util.List;
import java.util.stream.Collectors;

public class CompanyStaff {
    private static double totalSum = 0;

    public static double getTotalSum() {
        return totalSum;
    }

    public static void displayInfo(List<Employee> employeesList) {
        employeesList.forEach(employee -> {
                    System.out.println("Name: " + employee.getName());
                    System.out.println("Rate: " + employee.getRate());
                    System.out.println("Hours: " + employee.getHours());
                    System.out.println("----------");
                }
        );
    }

    public static List<Double> getSalaryList(List<Employee> employeesList) {
        return employeesList
                .stream()
                .map(employee -> {
                    totalSum += employee.getRate() * employee.getHours();
                    return employee.getRate() * employee.getHours();
                })
                .collect(Collectors.toList());
    }

    public static List<Double> getBonusList(List<Double> salaryList) {
        return salaryList
                .stream()
                .map(salary -> (double) Math.round(salary * 0.1) / 100)
                .collect(Collectors.toList());
    }
}
