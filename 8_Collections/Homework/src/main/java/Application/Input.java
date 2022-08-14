package Application;

import java.util.Map;
import java.util.Scanner;

public class Input {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static Integer readIdValue(Map<Integer, String> employeeMap) {
        Integer input;
        while (true) {
            try {
                input = Integer.parseInt(SCANNER.nextLine());
                if (!employeeMap.containsKey(input)) {
                    throw new RuntimeException();
                }
                return input;
            } catch (Exception e) {
                System.out.println(e + "\tInvalid ID input!");
            }
        }
    }

    public static String readNameValue(Map<Integer, String> employeeMap) {
        String input;
        while (true) {
            try {
                input = SCANNER.nextLine();
                if (!employeeMap.containsValue(input)) {
                    throw new RuntimeException();
                }
                return input;
            } catch (Exception e) {
                System.out.println(e + "\tInvalid Name input!");
            }
        }
    }
}
