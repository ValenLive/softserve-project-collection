import java.util.Scanner;

public class ScannerReader {
    private Scanner input;

    ScannerReader(Scanner scanner) {
        input = scanner;
    }

    public int readIntegerValue() {
        boolean isInteger = false;
        int result = 0;
        while (!isInteger) {
            try {
                result = Integer.parseInt(readStringValue());
            } catch (NumberFormatException e) {
                System.out.println("Type-in integer value to proceed!");//use interface
                continue;
            }
            isInteger = true;
        }
        return result;
    }

    public double readDoubleValue() {
        boolean isInteger = false;
        double result = 0;
        while (!isInteger) {
            try {
                result = Double.parseDouble(readStringValue());
            } catch (NumberFormatException e) {
                System.out.println("Type-in double value to proceed!");//use interface
                continue;
            }
            isInteger = true;
        }
        return result;
    }

    public String readStringValue() {
        return input.next();
    }

}
