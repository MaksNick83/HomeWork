public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -2, 4, 3, -2, 11, 5};
        int[] numbers1 = {-2, 4, 3};
        if (numbers.length >= numbers1.length) {
            int firstEl = numbers1[0];
            boolean isSubsequence = false;
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
            System.out.println(isSubsequence ? "Yes" : "No");
        }
    }
}