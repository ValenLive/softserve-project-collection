package Application;

import Intefaces.*;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class HomeworkSolver implements FirstHomework, SecondHomework, ThirdHomework, ForthHomework, FifthHomework {

    /**
     * First Assignment methods
     */
    @Override
    public List<Integer> getRandomIntegerList(int capacity, int bound) {
        return Stream.generate(() -> ThreadLocalRandom.current().nextInt(bound))
                .limit(capacity)
                .collect(Collectors.toList());
    }

    @Override
    public List<Integer> getFilteredIndexList(List<Integer> list, int number) {
        return Stream.iterate(0, index -> index + 1)
                .limit(list.size())
                .filter(index -> list.get(index) < number)
                .collect(Collectors.toList());
    }

    @Override
    public void removeElementsFromList(List<Integer> list, int number) {
        list.removeIf(item -> item > number);
    }

    @Override
    public void insertElementsInList(List<Integer> list, Map<Integer, Integer> map) {
        try {
            map.forEach(list::set);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + "Generated list doesn't have such index!");
        }
    }

    @Override
    public void printListWithIndex(List<Integer> list) {
        Stream.iterate(0, index -> index + 1)
                .limit(list.size())
                .forEach(index -> System.out.println("Position - " + index + "\tValue of element - " + list.get(index)));
    }

    @Override
    public List<Integer> sortList(List<Integer> list) {
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    /**
     * Second Assignment methods
     */

    @Override
    public String findEmployeeById(Map<Integer, String> employeeMap, Integer input) {
        return employeeMap.get(input);
    }

    @Override
    public Integer findEmployeeByName(Map<Integer, String> employeeMap, String input) {
        return employeeMap.keySet()
                .stream()
                .filter(key -> employeeMap.get(key).equals(input))
                .findFirst()
                .orElseThrow(InputMismatchException::new);
    }

    /**
     * Third Assignment methods
     */

    @Override
    public Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        return Stream.concat(set1.stream(), set2.stream())//.stream() converting to Stream type to use Stream.concat()
                .collect(Collectors.toSet());
    }

    @Override
    public Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
        return set1.stream()
                .filter(set2::contains)//filter is set2 contains set1
                .collect(Collectors.toSet());
    }

    /**
     * Forth Assignment methods
     */

    @Override
    public Map<String, String> uniqueFirstnameMap(Map<String, String> personMap) {
        Set<String> existing = new HashSet<>();//removing repeated values in map
        return personMap.entrySet()
                .stream()
                .filter(entry -> existing.add(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    /**
     * Fifth Assignment methods
     */

    public void printOrderedListByName(List<Student> studentList) {
        printStudents(studentList.stream()
                .sorted(Comparator.comparing(Student::getNAME))
                .toList());//Converting to stream then converting to list
    }

    public void printOrderedListByCourse(List<Student> studentList) {
        printStudents(studentList.stream()
                .sorted(Comparator.comparing(Student::getCOURSE))
                .toList());//Converting to stream then converting to list
    }

    public void printStudents(List<Student> studentList) {
        studentList.forEach(System.out::println);
    }

}
