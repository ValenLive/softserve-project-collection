import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerReader {
    private Scanner scanner;

    public ScannerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInteger() {
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
