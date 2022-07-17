public class MessagePrinter {
    private static final String MINUTE_INPUT_MESSAGE = "Input minute value:";
    private static final String GREEN_SQUARE = "\u001B[42m" + "\u001B[32m" + "+++" + "\u001B[0m";
    private static final String RED_SQUARE = "\u001B[41m" + "\u001B[31m" + "+++" + "\u001B[0m";


    public static void printGeneralMessage(String string){
        System.out.println(string);
    }
    public static void printMinuteInputMessage() {
        System.out.println(MINUTE_INPUT_MESSAGE);
    }

    public static void printGreenSquare() {
        System.out.println(GREEN_SQUARE);
    }

    public static void printRedSquare() {
        System.out.println(RED_SQUARE);
    }
}
