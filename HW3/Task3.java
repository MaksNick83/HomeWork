public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {3333, 11, 22, 30, 1234, 5555, 4444};
        for (int number : numbers) {
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
            }
        }
    }
}
