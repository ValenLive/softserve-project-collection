import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ScannerReader scannerReader = new ScannerReader(scanner);
        int arraySize = scannerReader.getArraySize();
        System.out.println(arraySize);
//        System.out.println((int)(Math.random() * (max - min + 1) + min));
    }
}
