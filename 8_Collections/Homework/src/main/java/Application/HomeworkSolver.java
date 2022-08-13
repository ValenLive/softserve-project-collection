package Application;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class HomeworkSolver {

    public List<Integer> getRandomIntegerList(int capacity, int bound) {
        //Stream class for Wrapper classes
        return Stream.generate(() -> ThreadLocalRandom.current().nextInt(bound))
                .limit(capacity)
                .collect(Collectors.toList());
        /*
        ****IntStream class for primitive int type***
        return IntStream.iterate(RANDOM.nextInt(bound), i -> RANDOM.nextInt(bound))
                .limit(capacity)
                .boxed()//Boxing into Wrapper class
                .collect(Collectors.toList());
         */
    }

    public List<Integer> getFilteredIndexList(List<Integer> list) {
        return Stream.iterate(0, index -> ++index)
                .limit(list.size())
                .filter(i -> list.get(i) < 5)
                .collect(Collectors.toList());
    }
}
