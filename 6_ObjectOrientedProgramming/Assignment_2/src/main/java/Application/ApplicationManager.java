package Application;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ApplicationManager {
    public void executeApplication() {
        List<Employee> employees = getEmployeeList();
        calculateSalary(employees);
        printEmployeesList(employees);


        System.out.println("--- Sorted in descending order: ---");
        printEmployeesList(sortEmployeeList(employees));

    }

    private List<Employee> getEmployeeList() {
        return List.of(
                new SalariedEmployee("0345", "Thomas", "543_645", 3.5, 11120),
                new SalariedEmployee("1237", "Abobus", "6343_645", 5.5, 200),
                new ContractEmployee("5643", "Bitcher", "23421556", 12500),
                new ContractEmployee("0112", "Jonah", "390943345", 22500)
        );
    }

    private void printEmployeesList(List<Employee> employees) {
        employees.forEach(System.out::println);
    }

    private void calculateSalary(List<Employee> employees) {
        employees.forEach(Employee::calculatePay);
    }

    private List<Employee> sortEmployeeList(List<Employee> employees) {
        return employees
                .stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }
}
