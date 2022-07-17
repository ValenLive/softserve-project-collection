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
        trafficLight.displayTrafficLightColor();
        scanner.close();
    }
}

//green:0_1_2_      5_6_7_     10_11_12_       15_16_17_
//  red:       3_4_        8_9_          13_14_          18_19_
