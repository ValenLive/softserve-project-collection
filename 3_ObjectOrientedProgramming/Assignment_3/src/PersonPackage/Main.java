package PersonPackage;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Creating list of people
        List<Person> people = getPeople();

        //Adding birth year to all objects
        Person.input(people);

        //Storing age list
        List<Integer> ageList = Person.getAgeList(people);
        System.out.println("Age of characters: " + ageList);

        //Changing name (using overloaded methods)
        Person person = getPersonById(people, 0);
        person.changeName("John");
        person.changeName("Morgan", "Freeman");

        //Displaying all info
        Person.displayInfo(people);
    }

    private static Person getPersonById(List<Person> people, int id){
        return people.get(id);
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


