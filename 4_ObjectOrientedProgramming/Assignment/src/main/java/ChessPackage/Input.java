package ChessPackage;

import java.util.InputMismatchException;
import java.util.Scanner;

class Input {
    static int readPositiveIntegerInput() {
        Scanner scanner = new Scanner(System.in);
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = scanner.nextInt();
                if (result <= 0) throw new InputMismatchException();
                isValid = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }
        return result;
    }
}
