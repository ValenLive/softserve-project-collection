package Application;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class HomeworkSolver {

    public List<Integer> getRandomIntegerList(int capacity, int bound) {
        return Stream.generate(() -> ThreadLocalRandom.current().nextInt(bound))
                .limit(capacity)
                .collect(Collectors.toList());
    }

    public List<Integer> getFilteredIndexList(List<Integer> list, int number) {
        return Stream.iterate(0, index -> index + 1)
                .limit(list.size())
                .filter(index -> list.get(index) < number)
                .collect(Collectors.toList());
    }

    public void removeElementsFromList(List<Integer> list, int number) {
        list.removeIf(item -> item > number);
    }

    public void insertElementsInList(List<Integer> list, Map<Integer, Integer> map) {
        try {
            map.forEach(list::set);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + "Generated list doesn't have such index!");
        }
    }

    public void printListWithIndex(List<Integer> list) {
        Stream.iterate(0, index -> index + 1)
                .limit(list.size())
                .forEach(index -> System.out.println("Position - " + index + "\tValue of element - " + list.get(index)));
    }

    public List<Integer> sortList(List<Integer> list){
        return list.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
