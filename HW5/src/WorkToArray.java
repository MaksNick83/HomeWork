public class WorkToArray {
    int[] numbers;
    int[] numbers1;

    public WorkToArray(int[] numbers, int[] numbers1) {
        this.numbers = numbers;
        this.numbers1 = numbers1;
    }

    public WorkToArray(int[] numbers) {
        this.numbers = numbers;
    }

    public WorkToArray() {
    }

    public boolean sequenceSearchInArray() {
        boolean isSubsequence = false;
        if (numbers.length >= numbers1.length) {
            int firstEl = numbers1[0];

            for (int i = 0; i < numbers.length; i++) {
                if (firstEl == numbers[i]) {
                    int k = i + 1;
                    int count = 0;
                    //the first matched, start with the second
                    for (int j = 1; j < numbers1.length; j++) {
                        if (numbers[k] == numbers1[j]) {
                            k++;
                            count++;
                        }
                    }
                    if (count == numbers1.length - 1) {
                        isSubsequence = true;
                        break;
                    }
                }
            }

        }
        return isSubsequence;
    }

    public void searchForDifferentNumbersInArray() {
        // int[] numbers = {3333, 11, 22, 30, 1234, 5555, 4444};
        for (int number : numbers) {
            if (isDifferentNumber(number)) {
                System.out.println(number);
            }

        }
    }

    public boolean isDifferentNumber(int number) {
        int[] digitsCountIndex = new int[10];
        int allDigits = 0, differentDigitsCount = 0;
        int numbersArray = number;
        while (numbersArray != 0) {
            int indexM = (numbersArray % 10);
            digitsCountIndex[indexM]++;
            numbersArray /= 10;
            allDigits++;
            if (digitsCountIndex[indexM] == 1) {
                differentDigitsCount++;
            }
        }
        if (allDigits == differentDigitsCount) {

            System.out.println(number);
            return true;
        }
        return false;
    }


    public String outSqrMatrix(int k) {
        int index = 1;

        int i = 0;
        int j = 0;
        String matrix = "";
        for (i = 0; i * i < k; i++) {
            for (j = 0; j * j < k; j++) {
                matrix += (index > k ? 0 : index++) + " ";
            }
            matrix += "\n";

        }
        return matrix;
    }

    public FindResult findLongest() {
        int digitLong = 0;
        int valueDigitLong = 0;
        for (int i = 0; i < numbers.length; i++) {
            int k = 0;//Save count digit
            int dig = numbers[i];
            while (dig != 0) {
                dig /= 10;
                k++;
            }
            if (i == 0) {
                digitLong = k;
            }
            if (k >= digitLong) {
                digitLong = k;
                valueDigitLong = numbers[i];
            }
        }
        return new FindResult(valueDigitLong, digitLong);
    }

    public FindResult findShortest() {
        int digitShort = 0;
        int valueDigitShort = 0;
        for (int i = 0; i < numbers.length; i++) {
            int k = 0;//Save count digit
            int dig = numbers[i];
            while (dig != 0) {
                dig /= 10;
                k++;
            }
            if (i == 0) {
                digitShort = k;
            }
            if (k <= digitShort) {
                digitShort = k;
                valueDigitShort = numbers[i];
            }
        }

        return new FindResult(valueDigitShort, digitShort);
    }


}
