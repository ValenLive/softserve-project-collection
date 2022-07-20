import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerReader {
    private Scanner scanner;

    ScannerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getArraySize() {
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            result = getIntegerValue();
            try {
                if (result < 4 || result % 4 != 0) {
                    throw new InputMismatchException();
                }
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Size should be more than 0 and result % 4 = 0");
            }
        }
        return result;
    }


    public int getIntegerValue() {
        System.out.println("Print integer : ");
        int result = 0;
        boolean isValid = false;
        while (!isValid) {
            try {
                result = scanner.nextInt();
                isValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch exception");
                scanner.nextLine();
            }
        }
        return result;
    }

}
