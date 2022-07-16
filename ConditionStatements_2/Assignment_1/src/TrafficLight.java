import java.util.InputMismatchException;
import java.util.Scanner;

public class TrafficLight {
    private int greenTime;
    private int redTime;
    private Scanner scanner;

    public TrafficLight(int greenTime, int redTime, Scanner scanner) {
        this.greenTime = greenTime;
        this.redTime = redTime;
        this.scanner = scanner;
    }
    public void displayTrafficLightColor() {
        int minutes = readMinuteValue() % 5;
        if (minutes >= 0 && minutes <= 2) {
            displayGreenLight();
        } else {
            displayRedLight();
        }
    }

    public int readMinuteValue() {
        MessagePrinter.printMinuteInputMessage();
        while (true) {
            int minutes;
            try {
                minutes = scanner.nextInt();
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

