package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    private static Scanner scanner = new Scanner(System.in);

    // TODO: USE GENERICS FOR INPUT
    static int readPositiveIntegerInput() {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = scanner.nextInt();
                if (result <= 0) throw new InputMismatchException();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
                scanner.nextLine();
            }
        }
        return result;
    }

    static double readPositiveFloatInput() {
        double result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = scanner.nextDouble();
                if (result <= 0) throw new InputMismatchException();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Incorrect input");
                scanner.nextLine();
            }
        }
        return result;
    }


}
