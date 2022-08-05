package Application;

import PersonPackage.Person;

import java.util.List;

public class ApplicationManager extends TaskSolver {

    public void executeApplication() {
        executeAnimalApplication();
        executePersonApplication();
    }

    private void executeAnimalApplication() {
        printAnimalInfo(getAnimalList());
    }

    private void executePersonApplication() {
        List<Person> people = getPeopleList();
        printPeopleInfo(people);
        printSalaryInfo(people);
    }

}
