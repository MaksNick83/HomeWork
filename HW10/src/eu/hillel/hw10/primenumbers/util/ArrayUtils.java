package eu.hillel.hw10.primenumbers.util;

public class ArrayUtils {
    public static int[] addToArray(int[] array, int digit) {
        int arrayCount = array.length + 1;
        int[] addDigits = new int[arrayCount];
        for (int i = 0; i < arrayCount - 1; i++) {
            addDigits[i] = array[i];
        }
        addDigits[arrayCount - 1] = digit;

        return addDigits;
    }

    public static int[] addArrayToArray(int[] arrayFrom, int[] arrayTo) {
        for (int i = 0; i < arrayTo.length; i++) {
            arrayFrom = addToArray(arrayFrom, arrayTo[i]);
        }
        return arrayFrom;
    }


}
