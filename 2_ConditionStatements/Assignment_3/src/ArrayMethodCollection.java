import javafx.util.Pair;

import java.util.ArrayList;

public class ArrayMethodCollection {

    public static Pair getMinAndMax(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return new Pair<>(minIndex, maxIndex);
    }

    public static double getArithmeticalMeanOfHalfArray(int[] array) {
        int sum = 0;
        for (int i = array.length - 1; i > array.length / 2; --i) {
            sum += array[i];
        }
        return sum / (double) (array.length / 2);
    }

    public static int[] replaceFirstToThirdQuarter(int[] array) {
        int temp;
        int customLength = array.length - 2 * array.length / 4;
        for (int i = 0; i < array.length / 4; i++) {
            temp = array[i];
            array[i] = array[customLength + i];
            array[customLength + i] = temp;
        }
        return array;
    }

    public static int[] getOddArray(int[] array) {
        ArrayList<Integer> arrayListOdd = new ArrayList<>();
        for (int item : array) {
            if (item % 2 == 1) {
                arrayListOdd.add(item);
            }
        }
        return arrayListOdd.stream().mapToInt(i -> i).toArray();
    }

    public static int[] getEvenArray(int[] array) {
        ArrayList<Integer> arrayListEven = new ArrayList<>();
        for (int item : array) {
            if (item % 2 == 0) {
                arrayListEven.add(item);
            }
        }
        return arrayListEven.stream().mapToInt(i -> i).toArray();
    }


}
