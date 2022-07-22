package PersonPackage;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear = 0;

    public Person() {
        this("Default_FirstName", "Default_LastName");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static void input(List<Person> people) {
        people.forEach(Person::readIntegerValue);
    }

    private static void readIntegerValue(Person person) {
        System.out.println("Input birth year of " + person.firstName + ": ");
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        while (!isValid) {
            try {
                person.birthYear = Integer.parseInt(scanner.next());
                if (person.birthYear <= 0 || person.birthYear >= 2022) {
                    throw new NumberFormatException();
                }
                isValid = true;
            } catch (NumberFormatException e) {
                System.out.println("Birth year value has to be more than 0 and lower than 2022");
                scanner.nextLine();
            }
        }
    }


    public static List<Integer> getAgeList(List<Person> people) {
        return people
                .stream()
                .map(person -> 2022 - person.birthYear)
                .collect(Collectors.toList());
    }

    public static void displayInfo(List<Person> people) {
        people.forEach(person -> {
            System.out.println("-----------------");
            System.out.println("First name: " + person.firstName);
            System.out.println("Last name: " + person.lastName);
            System.out.println("Birth year: " + person.birthYear);
        });
    }

    public void changeName(String firstName, String lastName) {
        changeName(firstName);
        this.lastName = lastName;
    }

    public void changeName(String firstName) {
        this.firstName = firstName;
    }


}
