package PersonPackage;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating list of people
        List<Person> people = getPeople();

        //Adding birth year to all objects
        Person.input(people);

        //Storing age
        int[] ageArray = Person.getAge(people);
        System.out.println("Age of characters: " + Arrays.toString(ageArray));

        //Changing name (using overloaded methods)
        people.get(0).changeName("John");
        people.get(0).changeName("Arthur", "Morgan");

        //Displaying all info
        Person.displayInfo(people);
    }

    private static List<Person> getPeople() {
        return List.of(
                new Person(),
                new Person("Cirilla", "Fiona Elen Riannon"),
                new Person("Geralt", "of Rivia"),
                new Person("Yennefer", "of Vengerberg"),
                new Person("Kanye", "West")
        );
    }
}


