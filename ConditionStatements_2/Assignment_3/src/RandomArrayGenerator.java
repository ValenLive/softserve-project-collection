public class RandomArrayGenerator {
    private final int RANGE_MIN;
    private final int RANGE_MAX;
    private final int ARRAY_SIZE;

    public RandomArrayGenerator(int RANGE_MIN, int RANGE_MAX, int ARRAY_SIZE) {
        this.RANGE_MIN = RANGE_MIN;
        this.RANGE_MAX = RANGE_MAX;
        this.ARRAY_SIZE = ARRAY_SIZE;
    }

    public int[] generateArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * (RANGE_MAX - RANGE_MIN + 1) + RANGE_MIN);
        }
        return array;
    }


}
