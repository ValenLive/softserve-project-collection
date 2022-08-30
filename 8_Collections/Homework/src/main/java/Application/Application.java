package Application;

import Intefaces.Homework;

import java.util.*;

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

        String employee = findEmployeeById(employeeMap, Input.readIdValue(employeeMap));
        System.out.println(employee);

        Integer employeeId = findEmployeeByName(employeeMap, Input.readNameValue(employeeMap));
        System.out.println(employeeId);

    }

    /**
     * Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), realizing
     * the operations of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets.
     */

    @Override
    public void executeHomework3() {
        Set<Integer> set1 = Set.of(1, 2, 3, 4, 5, 6);
        Set<Integer> set2 = Set.of(4, 5, 6, 7, 8, 9);

        Set<Integer> unionOfTwoSets = union(set1, set2);
        System.out.println(unionOfTwoSets);

        Set<Integer> intersectOfTwoSets = intersect(set1, set2);
        System.out.println(intersectOfTwoSets);
    }

    /**
     * Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
     * Output the entities of the map on the screen.
     * There are at less two persons with the same firstName among these 10 people?
     * Remove from the map person whose firstName is ” Max” (or other). Print result.
     */

    @Override
    public void executeHomework4() {
        Map<String, String> personMap = Map.of("Stavruk", "Valentyn", "White", "Emily", "Bolon", "Valentyn");
        System.out.println(personMap);

        Map<String, String> uniquePersonMap = uniqueFirstnameMap(personMap);
        System.out.println(uniquePersonMap);
    }

    /**
     * Write class Student that provides information about the name of the student and his course. Class
     * Student should consist of
     * <p>
     * properties for access to these fields
     * <p>
     * constructor with parameters
     * <p>
     * method printStudents (List students, Integer course), which receives a list of students and the
     * course number and prints to the console the names of the students from the list, which are taught
     * in this course (use an iterator)
     * <p>
     * methods to compare students by name and by course
     * <p>
     * In the main() method
     * <p>
     * declare List students and add to the list five different students
     * <p>
     * display the list of students ordered by name
     * <p>
     * display the list of students ordered by course.
     */

    @Override
    public void executeHomework5() {
        List<Student> studentList = List.of(
                new Student("Max", 1),
                new Student("Jorge", 7),
                new Student("April", 3),
                new Student("Chance", 4),
                new Student("Kyle", 12),
                new Student("Xi", 11),
                new Student("Geralt", 19)
        );
//      studentList.sort(Comparator.comparing(Student::getName)); - SORTING ONLY ARRAYLIST, mutating initial list

        printStudents(studentList);

        printOrderedListByName(studentList);

        printOrderedListByCourse(studentList);
    }

}
