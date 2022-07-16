public class MathematicalCalculator {
    private int a;
    private int b;

    private ScannerReader scannerReader;

    MathematicalCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void printAllCalculations() {
        System.out.println("a + b = " + sum());
        System.out.println("a - b = " + substract());
        System.out.println("a * b = " + multiplication());
        System.out.println("a / b = " + division());
    }

    public int sum() {
        return a + b;
    }

    public int substract() {
        return a - b;
    }

    public int multiplication() {
        return a * b;
    }

    public int division() {
        int result = 0;
        try {
            result = a / b;
        } catch (ArithmeticException e){
            System.out.println("B cannot be equal 0! Please enter non-zero integer");
        }
        return result;
    }

}
