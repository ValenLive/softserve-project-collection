package Application;

import java.util.Scanner;

public class Input {
    public static Scanner scanner = new Scanner(System.in);

    public static String readStringInput(){
        return scanner.nextLine();
    }
}
