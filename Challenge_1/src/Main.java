import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1) Task: Define integer variables a and b. Read values a and b from Console and calculate
        Scanner scanner = new Scanner(System.in);
        ScannerReader scannerReader = new ScannerReader(scanner);

        int a = scannerReader.readIntegerValue();
        int b = scannerReader.readIntegerValue();

        MathematicalCalculator mathematicalCalculator = new MathematicalCalculator(a, b);
        mathematicalCalculator.printAllCalculations();

        //2) Task: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
        System.out.println("How are you?");
        String answer = scannerReader.readStringValue();
        System.out.println("You are " + answer);

        //3) Find area of pentagon figure. a, b, c, d, e - edges. Angle ab = 90; gc = 90; cd = 90. ABG - прямокутний трикутник, EGDC - прямокутна трапеція (с - висота).
        double edgeA = scannerReader.readDoubleValue();
        double edgeB = scannerReader.readDoubleValue();
        double edgeC = scannerReader.readDoubleValue();
        double edgeD = scannerReader.readDoubleValue();
        scanner.close();
        AreaCalculator areaCalculator = new AreaCalculator(edgeA, edgeB, edgeC, edgeD);
        double areaResult = areaCalculator.getFigureArea();
        System.out.println(String.format("%.2f", areaResult));

        //4) Find calculation of factorial
        int calcResult = (2 * getFactorial(5) + 3 * getFactorial(8)) / (getFactorial(6) + getFactorial(4));
        System.out.println("Calculation result : " + calcResult);
    }
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
