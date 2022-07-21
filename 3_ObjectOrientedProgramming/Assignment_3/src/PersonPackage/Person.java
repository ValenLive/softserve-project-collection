package PersonPackage;

import java.util.List;
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

    public static void input(List<Person> people) {
        Scanner scanner = new Scanner(System.in);
        people.forEach(person -> {
            System.out.println("Input birth year of " + person.firstName + ": ");
            boolean isValid = false;
            while (!isValid) {
                try {
                    person.birthYear = Integer.parseInt(scanner.next());
                    if (person.birthYear <= 0 || person.birthYear >= 2022) {
                        throw new NumberFormatException();
                    }
                    isValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Birth year value has to be more than 0");
                    scanner.nextLine();
                }
            }
        });
    }

    public static int[] getAge(List<Person> people) {
        int[] ageArray = new int[people.size()];
        int i = 0;
        for (Person person : people) {
            ageArray[i] = 2022 - person.birthYear;
            i++;
        }
        return ageArray;
    }

    public static void displayInfo(List<Person> people) {
        people.forEach(person -> {
            System.out.println("-----------------");
            System.out.println("First name: " + person.firstName);
            System.out.println("Last name: " + person.lastName);
            System.out.println("Birth year: " + person.birthYear);
        });
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
    }

    public void changeName(String firstName, String lastName) {
        changeName(firstName);
        this.lastName = lastName;
    }

}
