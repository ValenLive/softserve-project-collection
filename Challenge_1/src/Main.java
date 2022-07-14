import java.util.Scanner;

public class Main {
    //Initializing input instance of Scanner class
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //1) Task: Define integer variables a and b. Read values a and b from Console and calculate
        int a = input.nextInt();
        int b = input.nextInt();
        String calcValue = twoIntCalculation(a, b);
        System.out.println(calcValue);

        //2) Task: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
        System.out.println("How are you?");
        String answer = input.next();
        System.out.println("You are " + answer + "...");

        //3) Find area of pentagon figure. a, b, c, d, e - edges.

        //4) Find calculation of factorial
        String calcResult = "Answer: " + (2 * getFactorial(5) + 3 * getFactorial(8)) / (getFactorial(6) + getFactorial(4));
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


}
