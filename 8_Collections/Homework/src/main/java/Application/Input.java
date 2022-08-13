package Application;

import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static Integer readIdValue() {
        String input;
        while (true) {
            try {
                input = scanner.nextLine();
                if (input.length() != 4) {
                    throw new RuntimeException();
                }
                return Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println(e + "\tInvalid ID format input!");
                scanner.nextLine();
            }

        }
    }

    public static String readNameValue(){
        while (true) {
            try {
                return scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e + "\tInvalid Name format input!");
                scanner.nextLine();
            }
        }
    }
}
