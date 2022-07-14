import java.util.Scanner;

public class Main {
    //Initializing input instance of Scanner class
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1) Task: Define integer variables a and b. Read values a and b from Console and calculate
        System.out.println("1) Type a and b values: ");
        int a = input.nextInt();
        int b = input.nextInt();
        String calcValue = twoIntCalculation(a, b);
        System.out.println(calcValue);

        //2) Task: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
        System.out.println("2) How are you?");
        String answer = input.next();
        System.out.println("You are " + answer + "...");

        //3) Find area of pentagon figure. a, b, c, d, e - edges. Angle ab = 90; gc = 90; cd = 90. ABG - прямокутний трикутник, EGDC - прямокутна трапеція (с - висота).
        System.out.println("3) Type length of a, b, c, d: ");
        double edgeA = input.nextDouble();
        double edgeB = input.nextDouble();
        double edgeC = input.nextDouble();
        double edgeD = input.nextDouble();
        double figureArea = getFigureArea(edgeA, edgeB, edgeC, edgeD);
        System.out.println("Area of a pentagon figure: " + String.format("%.2f", figureArea));

        //4) Find calculation of factorial
        String calcResult = "4) Calculation result : " + (2 * getFactorial(5) + 3 * getFactorial(8)) / (getFactorial(6) + getFactorial(4));
        System.out.println(calcResult);
    }

    public static String twoIntCalculation(int a, int b) {
        return "a + b = " + (a + b) +
                "\na - b = " + (a - b) +
                "\na * b = " + (a * b) +
                "\na / b = " + (double) a / b;
    }

    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
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


}
