import java.util.Scanner;

/**
 * Traffic light challenge:
 * green light 3 minutes
 * red light 2 minutes
 * Check what color of a light is displaying depending on minutes input value
 */
public class Main {
    public static void main(String[] args) {
        int greenTime = 3;
        int redTime = 2;

        Scanner scanner = new Scanner(System.in);
        TrafficLight trafficLight = new TrafficLight(greenTime, redTime, scanner);
        int minutes = trafficLight.readMinuteValue();
        scanner.close();
        trafficLight.displayTrafficLightColor(minutes);

    }
}
