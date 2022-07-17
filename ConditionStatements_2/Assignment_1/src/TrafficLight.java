import java.util.InputMismatchException;
import java.util.Scanner;

public class TrafficLight {
    private final int GREEN_TIME;
    private final int RED_TIME;
    private Scanner scanner;

    public TrafficLight(int greenTime, int redTime, Scanner scanner) {
        this.GREEN_TIME = greenTime;
        this.RED_TIME = redTime;
        this.scanner = scanner;
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
        MessagePrinter.printMinuteInputMessage();
        while (true) {
            try {
                int minutes = scanner.nextInt();
                if (minutes < 0) throw new InvalidTimeException("Minutes less zero!");
                return minutes;
            } catch (InputMismatchException e) {
                MessagePrinter.printGeneralMessage("Input Mismatch Exception: Type integer value!");
            } catch (InvalidTimeException e){
                MessagePrinter.printGeneralMessage(e.getMessage());
            } finally {
                scanner.nextLine(); //escaping from infinite loop
            }
        }
    }


    public void displayGreenLight() {
        MessagePrinter.printGreenSquare();
    }

    public void displayRedLight() {
        MessagePrinter.printRedSquare();
    }

}

