package Application;

import Intefaces.*;

import java.util.List;
import java.util.Map;
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
    public String findEmployeeById(Map<Integer, String> employeeMap) {
        Integer input;
        while (true) {
            try {
                input = Input.readIdValue();
                if (employeeMap.containsKey(Input.readIdValue())) {
                    return employeeMap.get(input);
                }
            } catch (Exception e) {
                System.out.println(e + "\tCannot find right ID value!");
            }
        }
    }

    public Integer findEmployeeByName(Map<Integer, String> employeeMap) {
        while (true) {
            try {
                return employeeMap.keySet()
                        .stream()
                        .filter(item -> employeeMap.get(item).equals(Input.readNameValue()))
                        .findAny()
                        .orElseThrow(RuntimeException::new);
            } catch (Exception e) {
                System.out.println(e + "\tCannot find right ID value!");
            }
        }
    }

}
