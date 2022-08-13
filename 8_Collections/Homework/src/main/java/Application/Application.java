package Application;

import java.util.List;
import java.util.Map;

public class Application extends HomeworkSolver implements Homework {

    @Override
    public void executeApplication() {
        executeHomework1();
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

        Map<Integer, Integer> indexToElementMap = Map.of(2,1, 8, -3,5,-4);//only 10 entries
        insertElementsInList(myCollection, indexToElementMap);
        System.out.println(myCollection);

        printListWithIndex(myCollection);

        List<Integer> sortedList = sortList(myCollection);
        System.out.println(sortedList);
    }

    @Override
    public void executeHomework2() {

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
