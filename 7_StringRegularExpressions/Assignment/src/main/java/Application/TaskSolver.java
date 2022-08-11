package Application;

import org.apache.commons.lang3.tuple.ImmutablePair;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

abstract class TaskSolver {
    public boolean isSubstring(ImmutablePair<String, String> pair) {
        return Pattern.compile(pair.right)
                .matcher(pair.left)
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

    public String getLongestWord(List<String> list) {
        return list.stream()
                .max(Comparator.comparingInt(String::length))
                .map(Objects::toString)
                .orElseThrow(RuntimeException::new);
    }

    public void printString(String str) {
        System.out.println(str);
    }

    public void printStringLength(String str) {
        System.out.println("String length: " + str.length());
    }

    public void printSecondWordOfList(List<String> sentences) {
        System.out.println("Second word: " + (sentences.contains(sentences.get(1)) ? sentences.get(1) : new ArrayIndexOutOfBoundsException()));
    }

    public void printRefactoredWhitespaceText(String str) {
        System.out.println(str.replaceAll("\\s+", " "));
    }
}
