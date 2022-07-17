import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerReader {
    private Scanner scanner;

    public ScannerReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public void getIntegerData() {
        int number = readInteger();
        int digitCount = getDigitCount(number);
        boolean hasDigitOverInputValue = hasDigitOverInputValue(number);
        int reversedNumber = reverseNumber(number);
        printIntegerData(number, digitCount, hasDigitOverInputValue, reversedNumber);
    }

    public void printIntegerData(int number, int digitCount, boolean hasDigitOverInputValue, int reversedNumber) {
        System.out.println("Integer value: " + number);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Has a digit over value of 4: " + hasDigitOverInputValue);
        System.out.println("Reversed number: " + reversedNumber);
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

    public int getDigitCount(int number) {
        number = Math.abs(number);
        return Integer.toString(number).length();
    }

    public boolean hasDigitOverInputValue(int number) {
        int iterator = getDigitCount(number);
        if (number < 0){
            number = Math.abs(number);
            iterator--;
        }
        for (int i = 0; i < iterator; i++) {
            int result = number % 10;
            number /= 10;
            if (result > 4) {
                return true;
            }
        }
        return false;
    }

    public int reverseNumber(int number) {
        String reversedNumber = number < 0 ? "-" : "0";
        number = Math.abs(number);
        while (number > 0) {
            reversedNumber += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reversedNumber);
    }


}
