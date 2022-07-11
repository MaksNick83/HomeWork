public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {33333, 11, 22, 33, 1111, 5555, 4444};
        int digitShort = 0, digitLong = 0, valueDigitShort = 0, valueDigitLong = 0;
        for (int i = 0; i < numbers.length; i++) {
            int k = 0;//Save count digit
            int dig = numbers[i];
            while (dig != 0) {
                dig /= 10;
                k++;
            }
            if (i == 0) {
                digitShort = k;
                digitLong = k;
            }
            if (k <= digitShort) {
                digitShort = k;
                valueDigitShort = numbers[i];
            }
            if (k >= digitLong) {
                digitLong = k;
                valueDigitLong = numbers[i];
            }
        }
        System.out.println("Last short number Value = " + valueDigitShort + " Digits = " + digitShort);
        System.out.println("Last long number Value = " + valueDigitLong + " Digits = " + digitLong);
    }
}
