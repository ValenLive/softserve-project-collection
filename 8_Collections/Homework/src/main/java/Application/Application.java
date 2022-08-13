package Application;

import Intefaces.Homework;

import java.util.List;
import java.util.Map;

public class Application extends HomeworkSolver implements Homework {

    @Override
    public void executeApplication() {
//        executeHomework1();
        executeHomework2();
        executeHomework3();
        executeHomework4();
        executeHomework5();
    }

    /**
     * Declare collection myCollection of 10 integers and fill it (from the console or random):
     * Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
     * Remove from collection myCollection elements, which are greater than 20. Print result
     * Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
     * Sort and Print collection
     */

    @Override
    public void executeHomework1() {
        List<Integer> myCollection = getRandomIntegerList(10, 26);
        System.out.println(myCollection);

        List<Integer> newCollection = getFilteredIndexList(myCollection, 5);
        System.out.println(newCollection);

        removeElementsFromList(myCollection, 20);
        System.out.println(myCollection);

        insertElementsInList(myCollection, Map.of(2, 1, 8, -3, 5, -4));//only 10 entries
        System.out.println(myCollection);

        printListWithIndex(myCollection);

        List<Integer> sortedList = sortList(myCollection);
        System.out.println(sortedList);
    }

    /**
     * In the main() method declare map employeeMap of pairs <Integer, String>.
     * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
     * Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID - say about it to user (use function containsKey()).
     * Ask user to enter name, verify than you have a name in your map and write corresponding ID. If you can't find this name - say about it to user (use function containsValue()).
     */

    @Override
    public void executeHomework2() {
        Map<Integer, String> employeeMap = Map.of(
                2345, "Max",
                5432, "Thomas",
                4645, "Joyce",
                3536, "Nathan",
                2348, "Drake",
                4353, "Emily",
                2874, "Howard"
        );
        System.out.println(employeeMap);

        String employee = findEmployeeById(employeeMap);
        System.out.println(employee);

        int employeeId = findEmployeeByName(employeeMap);
        System.out.println(employeeId);

    }


    @Override
    public void executeHomework3() {

    }

    @Override
    public void executeHomework4() {

    }

    @Override
    public void executeHomework5() {

    }

}