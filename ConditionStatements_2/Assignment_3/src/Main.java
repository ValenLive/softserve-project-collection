import javafx.util.Pair;

import java.util.Arrays;
import java.util.Scanner;

//JavaFX library
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Storing values from scanner
        ScannerReader scannerReader = new ScannerReader(scanner);
        int elementRangeMin = scannerReader.getIntegerValue();
        int elementRangeMax = scannerReader.getIntegerValue();
        int arraySize = scannerReader.getArraySize();

        //Generating array with random values
        RandomArrayGenerator randomArrayGenerator = new RandomArrayGenerator(elementRangeMin, elementRangeMax, arraySize);
        int[] array = randomArrayGenerator.generateArray();
        System.out.println(Arrays.toString(array));


        //Solving Assignment
        //1) Get min and max values indexes
        Pair<Integer, Integer> minMaxIndexPair = ArrayMethodCollection.getMinAndMax(array);
        System.out.println("Min index: " + minMaxIndexPair.getKey());
        System.out.println("Max index: " + minMaxIndexPair.getValue());

        //2)Arithmetical mean of half array
        int arithmeticalMeanOfHalfArray = ArrayMethodCollection.getArithmeticalMeanOfHalfArray(array);
        System.out.println("Arithmetical mean of half array: " + arithmeticalMeanOfHalfArray);

        //3)Change places
        int[] replacedArray = ArrayMethodCollection.replaceFirstToThirdQuarter(array);
        System.out.println("Replaced array: " + Arrays.toString(replacedArray));

        //4)
    }
}
