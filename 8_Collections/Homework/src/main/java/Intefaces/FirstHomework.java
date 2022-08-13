package Intefaces;

import java.util.List;
import java.util.Map;

public interface FirstHomework {
    List<Integer> getRandomIntegerList(int capacity, int bound);

    List<Integer> getFilteredIndexList(List<Integer> list, int number);

    void removeElementsFromList(List<Integer> list, int number);

    void insertElementsInList(List<Integer> list, Map<Integer, Integer> map);

    void printListWithIndex(List<Integer> list);

    List<Integer> sortList(List<Integer> list);

}
