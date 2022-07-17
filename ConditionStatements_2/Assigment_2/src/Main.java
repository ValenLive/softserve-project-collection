import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ScannerReader scannerReader = new ScannerReader(scanner);
        int number = scannerReader.readInteger();

        scanner.close();

        InputManipulator inputManipulator = new InputManipulator(number);
        inputManipulator.getNumberData();
    }
}
