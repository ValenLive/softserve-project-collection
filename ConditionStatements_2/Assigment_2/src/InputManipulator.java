public class InputManipulator {
    private final int number;

    InputManipulator(int number){
        this.number = number;
    }

    public void getNumberData() {
        int digitCount = getDigitCount(number);
        boolean hasDigitOverInputValue = hasDigitOverInputValue(number);
        int reversedNumber = reverseNumber(number);

        printNumberData(digitCount, hasDigitOverInputValue, reversedNumber);
    }

    public void printNumberData(int digitCount, boolean hasDigitOverInputValue, int reversedNumber) {
        System.out.println("Digit count: " + digitCount);
        System.out.println("Has a digit over value of 4: " + hasDigitOverInputValue);
        System.out.println("Reversed number: " + reversedNumber);
    }


    public int getDigitCount(int num) {
        num = Math.abs(num);
        return Integer.toString(num).length();
    }

    public boolean hasDigitOverInputValue(int num) {
        int iterator = getDigitCount(num);
        if (num < 0){
            num = Math.abs(num);
            iterator--;
        }
        for (int i = 0; i < iterator; i++) {
            int result = num % 10;
            num /= 10;
            if (result > 4) {
                return true;
            }
        }
        return false;
    }

    public int reverseNumber(int num) {
        String reversedNumber = num < 0 ? "-" : "0";
        num = Math.abs(num);
        while (num > 0) {
            reversedNumber += num % 10;
            num /= 10;
        }
        return Integer.parseInt(reversedNumber);
    }

}
