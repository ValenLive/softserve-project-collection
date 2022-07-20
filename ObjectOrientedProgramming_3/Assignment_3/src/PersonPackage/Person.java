package PersonPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear = 1999;

    public Person() {
        this("Default_FirstName", "Default_LastName");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void input(ArrayList<Person> personList) {
        Scanner scanner = new Scanner(System.in);
        for (Person person : personList) {
            System.out.println("Input birth year of " + person.firstName + ": ");
            boolean isValid = false;
            while (!isValid) {
                try {
                    person.birthYear = Integer.parseInt(scanner.next());
                    if (person.birthYear <= 0) {
                        throw new NumberFormatException();
                    }
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Birth year value has to be more than 0");
                    scanner.nextLine();
                }
            }
        }
    }

    public static int[] getAge(ArrayList<Person> personList) {
        int[] ageArray = new int[personList.size()];
        int i = 0;
        for (Person person : personList) {
            ageArray[i] = 2022 - person.birthYear;
            i++;
        }
        return ageArray;
    }

    public static void displayInfo(ArrayList<Person> personList){
        for (Person person : personList) {
            System.out.println("-----------------");
            System.out.println("First name: " + person.firstName);
            System.out.println("Last name: " + person.lastName);
            System.out.println("Birth year: " + person.birthYear);
        }
    }

    public void changeName(String firstName){
        this.firstName = firstName;
    }

    public void changeName(String firstName, String lastName){
        changeName(firstName);
        this.lastName = lastName;
    }

}
