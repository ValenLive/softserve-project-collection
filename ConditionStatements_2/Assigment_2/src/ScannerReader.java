import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerReader {
    private Scanner scanner;

    public ScannerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public int readInteger() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Input mismatch exception");
            } finally {
                scanner.nextLine();
            }
        }
    }


}
