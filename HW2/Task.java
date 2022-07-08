public class Task {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -2, 11, 97};
        String notEven = "", even = "", prime = ""; //наполняем результат, что бы не ганять несколько циклов
        int min = numbers[0], max = numbers[0]; // первоначальная инициализация
        for (int i = 0; i < numbers.length; i++) {
            //Четные,не четные
            if ((numbers[i] % 2) == 0) {
                even += numbers[i] + " ";
            } else {
                notEven += numbers[i] + " ";
            }
            // Простые
            if (numbers[i] > 1) {
                int numberDivisors = 0;
                for (int j = 2; j < numbers[i]; j++) {
                    if (numbers[i] % j == 0) {
                        numberDivisors++;
                    }
                }
                if (numberDivisors == 0) {
                    prime += numbers[i] + " ";
                }
            }
            // Минимальное
            if (numbers[i] < min) {
                min = numbers[i];
            }
            // Максимальное
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Even: " + even);
        System.out.println("Not even: " + notEven);
        System.out.println("Prime: " + prime);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        //Ряд фибоначи, 20 членов
        int countDig = 20;
        int[] fibanachyDig = new int[countDig];
        fibanachyDig[0] = 1;
        fibanachyDig[1] = 1;
        for (int i = 2; i < countDig; i++) {
            fibanachyDig[i] = fibanachyDig[i - 2] + fibanachyDig[i - 1];
        }
        //вывод
        System.out.print("Fibonacci numbers:");
        for (int i = 0; i < fibanachyDig.length; i++) {
            System.out.print(fibanachyDig[i] + (i == countDig - 1 ? "" : ","));
        }
    }
}