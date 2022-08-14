package Intefaces;

import java.util.Map;

public interface SecondHomework {
     String findEmployeeById(Map<Integer, String> employeeMap, Integer input);

     Integer findEmployeeByName(Map<Integer, String> employeeMap, String input);
}
