import javafx.util.Pair;

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
        return sum / (double)(array.length / 2);
    }

//array.length/4 = кількість елементів у чверті
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
}
