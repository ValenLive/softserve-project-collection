public class MessagePrinter {
    enum Message {
        INPUT_VALUE,
        INPUT_MISMATCH,
        GREEN_SQUARE,
        RED_SQUARE,
    }

    public static void printGeneralMessage(Message message) {
        switch (message) {
            case INPUT_VALUE -> System.out.println("Input value:");
            case GREEN_SQUARE -> System.out.println("\u001B[42m" + "\u001B[32m" + "+++" + "\u001B[0m");
            case RED_SQUARE -> System.out.println("\u001B[41m" + "\u001B[31m" + "+++" + "\u001B[0m");
            case INPUT_MISMATCH -> System.out.println("Input Mismatch Exception: Type correct value");
            default -> System.out.println("No such command!");
        }
    }
}
