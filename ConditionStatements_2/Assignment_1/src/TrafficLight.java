import java.util.InputMismatchException;
import java.util.Scanner;

public class TrafficLight {
    private final int GREEN_TIME;
    private final int RED_TIME;
    private final Scanner SCANNER;

    public TrafficLight(int greenTime, int redTime, Scanner scanner) {
        this.GREEN_TIME = greenTime;
        this.RED_TIME = redTime;
        this.SCANNER = scanner;
    }

    public void displayTrafficLightColor(int minutes) {
        int minuteValue = minutes % (GREEN_TIME + RED_TIME);
        if (minuteValue >= 0 && minuteValue <= 2) {
            displayGreenLight();
        } else {
            displayRedLight();
        }
    }

    public int readMinuteValue() {
        MessagePrinter.printGeneralMessage(MessagePrinter.Message.INPUT_VALUE);
        int minutes = 0;
        boolean isValidMinute = false;

        while (!isValidMinute) {
            try {
                minutes = SCANNER.nextInt();
                if (minutes < 0) {
                    throw new InputMismatchException();
                }
                isValidMinute = true;
            } catch (InputMismatchException e) {
                MessagePrinter.printGeneralMessage(MessagePrinter.Message.INPUT_MISMATCH);
                SCANNER.nextLine(); //escaping from infinite loop
            }
        }
        return minutes;
    }


    private void displayGreenLight() {
        MessagePrinter.printGeneralMessage(MessagePrinter.Message.GREEN_SQUARE);
    }

    private void displayRedLight() {
        MessagePrinter.printGeneralMessage(MessagePrinter.Message.RED_SQUARE);
    }

}

