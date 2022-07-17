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
    public void displayTrafficLightColor() {
        int minutes = readMinuteValue() % (GREEN_TIME + RED_TIME);
        if (minutes >= 0 && minutes <= 2) {
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
                if (minutes < 0) throw new InvalidTimeException();
                return minutes;
            } catch (InputMismatchException e) {
                MessagePrinter.printInputMisMatchException();
            } catch (InvalidTimeException e){
                MessagePrinter.printTimeNegativeException();
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

