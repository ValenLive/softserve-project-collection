import java.util.Scanner;

public class Main {
    //Initializing input instance of Scanner class
    private static final Scanner MY_INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        ScannerRead sr = new ScannerRead();
        //1) Task: Define integer variables a and b. Read values a and b from Console and calculate
        System.out.println("1) Type a and b int values: ");
        int a = MY_INPUT.nextInt();
        int b = MY_INPUT.nextInt();
        String calcValue = getTwoIntCalculation(a, b);
        System.out.println(calcValue);

        //2) Task: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
        System.out.println("2) How are you?");
        String answer = MY_INPUT.next();
        System.out.println("You are " + answer + "...");

        //3) Find area of pentagon figure. a, b, c, d, e - edges. Angle ab = 90; gc = 90; cd = 90. ABG - прямокутний трикутник, EGDC - прямокутна трапеція (с - висота).
        System.out.println("3) Type length of a, b, c, d: ");
        double edgeA = MY_INPUT.nextDouble();
        double edgeB = MY_INPUT.nextDouble();
        double edgeC = MY_INPUT.nextDouble();
        double edgeD = MY_INPUT.nextDouble();
        MY_INPUT.close();
        double figureArea = getFigureArea(edgeA, edgeB, edgeC, edgeD);
        System.out.println("Area of a pentagon figure: " + String.format("%.2f", figureArea));

        //4) Find calculation of factorial
        int calcResult = (2 * getFactorial(5) + 3 * getFactorial(8)) / (getFactorial(6) + getFactorial(4));
        System.out.println("4) Calculation result : " + calcResult);
    }

    public static String getTwoIntCalculation(int a, int b) {
        return "a + b = " + (a + b) +
                "\na - b = " + (a - b) +
                "\na * b = " + (a * b) +
                "\na / b = " + (double) a / b;
    }

    public static double getFigureArea(double a, double b, double c, double d) {
        //Find g length of ABG
        double g = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        //Area of ABG
        double areaABG = (a * b) / 2;
        //Area of EGDC
        double areaEGDC = (g + d) / 2 * c;
        //Area of figure
        return areaEGDC + areaABG;
    }

    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }


}
