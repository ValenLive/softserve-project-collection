package Application;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.List;
import java.util.regex.Pattern;

abstract class TaskSolver {
    public boolean isSubstring(ImmutablePair<String, String> pair) {
        return Pattern.compile(pair.getRight())
                .matcher(pair.getLeft())
                .find();
    }

    public String getSurnameAndInitials(String str) {
        String[] strArr = str.split(" ");
        return strArr[1] + " "
                + strArr[0].charAt(0) + "."
                + strArr[2].charAt(0) + ".\n"
                + strArr[0] + "\n"
                + str;
    }

    public void printValidStrings(List<String> list, Pattern pattern) {
        list.stream()
                .filter(item -> pattern
                        .matcher(item)
                        .matches())
                .forEach(System.out::println);
    }
}
