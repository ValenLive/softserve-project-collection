import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerReader {
    private Scanner scanner;

    ScannerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    // x >= 4
    public int getArraySize() {
        while (true) {
            try {
                int size = getIntegerValue();
                if (size <= 0) throw new RuntimeException("Size should be more than 4");
                if (size % 4 != 0) throw new RuntimeException("Should be dividable by 4:");
                return size;
            } catch (RuntimeException e) {
                System.out.println(e);
            } finally {
                getIntegerValue();
            }
        }
    }

    private int getIntegerValue() {
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
