package PersonPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personList = new ArrayList<>();

        Person person = new Person();
        Person ciri = new Person("Cirilla", "Fiona Elen Riannon");
        Person geralt = new Person("Geralt", "of Rivia");
        Person yennefer = new Person("Yennefer", "of Vengerberg");
        Person kanye = new Person("Kanye", "West");

        //Creating list of people
        Collections.addAll(personList, person, ciri, geralt, yennefer, kanye);

        //Adding birth year to all objects
        Person.input(personList);

        //Storing age
        int[] ageArray = Person.getAge(personList);
        System.out.println("Age of characters: " + Arrays.toString(ageArray));

        //Changing name (using overloaded methods)
        person.changeName("John");
        person.changeName("Arthur", "Morgan");

        //Displaying all info
        Person.displayInfo(personList);
    }
}
