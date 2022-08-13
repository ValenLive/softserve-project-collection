package Application;

import java.util.List;
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
        return Stream.iterate(0, index -> ++index)
                .limit(list.size())
                .filter(index -> list.get(index) < number)
                .collect(Collectors.toList());
    }

    public void removeElementsFromList(List<Integer> list, int number) {
        list.removeIf(n -> n > number);
    }
}
