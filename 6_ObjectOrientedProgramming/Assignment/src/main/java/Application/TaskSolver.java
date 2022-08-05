package Application;

import AnimalPackage.Animal;
import AnimalPackage.Cat;
import AnimalPackage.Dog;
import PersonPackage.*;

import java.util.List;

abstract class TaskSolver {
    /**
     * Practice 1
     */
    List<Animal> getAnimalList() {
        return List.of(
                new Dog("Alaskan"),
                new Dog("Doberman"),
                new Cat("British"),
                new Cat("Maine")
        );
    }

    void printAnimalInfo(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.feed();
            animal.voice();
        });
    }

    /**
     * Practice 2
     */
    List<Person> getPeopleList() {
        return List.of(
                new Teacher("Tiffany", 1200),
                new Student("Tom"),
                new Cleaner("Jack", 400)
        );
    }

    void printPeopleInfo(List<Person> people) {
        people.forEach(Person::print);
    }

    void printSalaryInfo(List<Person> people) {
        people.stream()
                .filter(person -> person instanceof Staff)
                .forEach(person -> ((Staff) person).salary());
    }

}
