package Application;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class TaskCollection extends TaskSolver {
    public void executePracticalTasks() {
        System.out.println("-----Task1-----");
        executeTask1();
        System.out.println("-----Task2-----");
        executeTask2();
        System.out.println("-----Task3-----");
        executeTask3();
    }

    public void executeHomework() {
        System.out.println("-----Homework1-----");
        executeHomework1();
        System.out.println("-----Homework2-----");
        executeHomework2();
        System.out.println("-----Homework3-----");
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
        printString(user);
    }

    /**
     * The username can be 3 to 15 characters of the Latin alphabet, numbers, and underscores. Using regular
     * expressions implement checking the username for validity. Input five names in the main method . Output a
     * message to the console of the validation of each of the entered names.
     */

    private void executeTask3() {
        List<String> usernameList = List.of("Xx_Gamer_xX", "Max", "Heisenberg", "''''''", " ", "1", "a", "88_", "SuperDuperLongLongWord");
        printValidStrings(usernameList, Pattern.compile("\\w{2,15}"));
    }

    /*
     * =============================HOME WORK=================================
     */

    /**
     * Enter in console sentence of five words.
     * display the longest word in the sentence
     * determine the number of its letters
     * bring the second word in reverse order
     */

    private void executeHomework1() {
        List<String> sentences = Arrays.asList(Input.readStringInput().split(" "));
        String longestWord = getLongestWord(sentences);
        printString(longestWord);
        printStringLength(longestWord);
        printSecondWordOfList(sentences);
    }

    /**
     * Enter a sentence that contains the words between more than one space. Convert all spaces,
     * consecutive, one. For example, if we introduce the sentence "I am learning Java Core», we
     * have to get the "I'm learning Java Core»
     */

    private void executeHomework2() {
        printRefactoredWhitespaceText(Input.readStringInput());
    }

    /**
     * Implement a pattern for US currency: the first symbol "$", then any number of digits, dot and two
     * digits after the dot. Enter the text from the console that contains several occurrences of US currency.
     * Display all occurrences on the screen.
     */

    public void executeHomework3() {
        String str = Input.readStringInput();
        System.out.println(
                Pattern.compile("^\\$?(\\d{1,3},(\\d{3},)*\\d{3}|\\d+)(.\\d\\d)?$")
                        .matcher(str).matches() ? "$" + str : "Invalid number"
        );
    }


}
