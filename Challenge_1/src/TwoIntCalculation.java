import java.util.Scanner;

public class TwoIntCalculation {
    private int a;
    private int b;

    public TwoIntCalculation(Scanner a, Scanner b) {
        this.a = a.nextInt();
        this.b = b.nextInt();
    }

    //Method calculating two integers
    public void getCalc() {
        System.out.println("a + b = " + (a + b) +
                "\na - b = " + (a - b) +
                "\na * b = " + (a * b) +
                "\na / b = " + (double) a / b);
    }
}
