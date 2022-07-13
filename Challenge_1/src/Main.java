import java.util.Scanner;

public class Main {
    //Initializing input instance of Scanner class
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //1) Task: Define integer variables a and b. Read values a and b from Console and calculate
        TwoIntCalculation calc = new TwoIntCalculation(input, input);
        calc.getCalc();

        //2) Task: Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)".
        System.out.println("How are you?");
        String answer = input.next();
        System.out.println("You are " + answer + "...");

        //3) Find area of pentagon figure. a, b, c, d, e - edges.

        //4) Find calculation of factorial
        int j = factorialUsingForLoop(5);
        int l = factorialUsingForLoop(8);
        int k = factorialUsingForLoop(6);
        int h = factorialUsingForLoop(4);
        System.out.println("Answer: " + (2 * j + 3 * l) / (k + h));


    }

    public static int factorialUsingForLoop(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }


}
