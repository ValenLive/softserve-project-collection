public class MessagePrinter {
    private static final String MINUTE_INPUT_MESSAGE = "Input minute value:";
    private static final String TIME_NEGATIVE_EXCEPTION = "Invalid Time Exception";
    private static final String INPUT_MISMATCH_EXCEPTION = "Input Mismatch Exception";
    private static final String GREEN_SQUARE = "\u001B[42m" + "\u001B[32m" + "+++" + "\u001B[0m";
    private static final String RED_SQUARE = "\u001B[41m" + "\u001B[31m" + "+++" + "\u001B[0m";


    public static void printMinuteInputMessage() {
        System.out.println(MINUTE_INPUT_MESSAGE);
    }

    public static void printTimeNegativeException() {
        System.out.println(TIME_NEGATIVE_EXCEPTION);
    }

    public static void printInputMisMatchException() {
        System.out.println(INPUT_MISMATCH_EXCEPTION);
    }

    public static void printGreenSquare() {
        System.out.println(GREEN_SQUARE);
    }

    public static void printRedSquare() {
        System.out.println(RED_SQUARE);
    }
}
