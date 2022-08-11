package Application;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;
import java.util.regex.Pattern;

public class TaskCollection extends TaskSolver {
    public void executePracticalTasks() {
        executeTask1();
        executeTask2();
        executeTask3();
    }

    public void executeHomework() {
        executeHomework1();
        executeHomework2();
        executeHomework3();
    }


    /**
     * Enter the two variables of type String. Determine whether the first variable substring second. For
     * example, if you typed «IT» and «IT Academy» you must receive true.
     */
    private void executeTask1() {
        boolean hasSubstring = isSubstring(new ImmutablePair<>(Input.readStringInput(), Input.readStringInput()));
        System.out.println(hasSubstring);
    }

    /**
     * Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
     * surnames and initials;
     * name;
     * name, middle name and last name
     */
    private void executeTask2() {
        String user = getSurnameAndInitials("Valentyn Stavruk Romanovych");
        System.out.println(user);
    }

    /**
     * The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. Using regular
     * expressions implement checking the username for validity. Input five names in the main method . Output a
     * message to the console of the validation of each of the entered names.
     */
    private void executeTask3() {
        List<String> usernameList = List.of("Xx_Gamer_xX", "Gonzales", "Max", "Heisenberg", "", " ", "1", "a", "88_", "SuperDuperLongLongWord");
        usernameList.forEach(username -> System.out.println(
                Pattern.compile("\\w{2,15}")
                        .matcher(username)
                        .matches()
        ));
    }


    private void executeHomework1() {

    }

    private void executeHomework2() {

    }

    private void executeHomework3() {

    }


}
