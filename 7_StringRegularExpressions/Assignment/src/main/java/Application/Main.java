package Application;

import java.util.List;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        PracticalTasks practicalTasks = new PracticalTasks();

        practicalTasks.executePracticalTasks();
        practicalTasks.executeHomework();



        /*
          Enter surname, name and patronymic on the console as a variable of type String. Output on the console:
          surnames and initials;
          name;
          name, middle name and last name
         */



        /*
        The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. Using regular
        expressions implement checking the username for validity. Input five names in the main method . Output a
        message to the console of the validation of each of the entered names.
         */
        List<String> usernameList = List.of("Xx_Gamer_xX", "Gonzales", "Max", "Heisenberg", "", " ", "1", "a", "88_", "SuperDuperLongLongWord");
        usernameList.forEach(username -> System.out.println(
                Pattern.compile("\\w{2,15}")
                .matcher(username)
                .matches()
        ));


    }


}
