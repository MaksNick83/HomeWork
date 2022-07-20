public class Task3 {
    //3. Рекурсивно вычислить сумму цифр числа
    public static void main(String[] args) {
        int number = 1111;
        System.out.println(sumNumber(number));
    }

    private static int sumNumber(int number) {
        if (number < 10) {
            return number;
        } else {
            return (number % 10) + sumNumber(number / 10);
        }
    }
}