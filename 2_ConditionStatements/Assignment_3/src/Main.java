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
        int[] arrayA = randomArrayGenerator.generateArray();
        System.out.println("Array A: " + Arrays.toString(arrayA));


        //Solving Assignment
        //1) Get min and max values indexes
        Pair<Integer, Integer> minMaxIndexPair = ArrayMethodCollection.getMinAndMax(arrayA);
        System.out.println("Min index: " + minMaxIndexPair.getKey());
        System.out.println("Max index: " + minMaxIndexPair.getValue());

        //2)Arithmetical mean of half array
        double arithmeticalMeanOfHalfArray = ArrayMethodCollection.getArithmeticalMeanOfHalfArray(arrayA);
        System.out.println("Arithmetical mean of half array: " + String.format("%.2f", arithmeticalMeanOfHalfArray));

        //3)Change places
        int[] replacedArray = ArrayMethodCollection.replaceFirstToThirdQuarter(arrayA);
        System.out.println("Replaced array: " + Arrays.toString(replacedArray));

        //4)Create B and C arrays. Add even elements of array A to array B, to C array odd elem
        int[] oddArray = ArrayMethodCollection.getOddArray(arrayA);
        int[] evenArray = ArrayMethodCollection.getEvenArray(arrayA);
        System.out.println("Odd array: " + Arrays.toString(oddArray));
        System.out.println("Even array: " + Arrays.toString(evenArray));

    }
}
