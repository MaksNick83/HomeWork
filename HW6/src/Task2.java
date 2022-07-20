public class Task2 {

    public static void main(String[] args) {
        outNumber(2);
    }

    private static void outNumber(int number) {
        if (number == 0) {
            return;
        } else {
            outNumber(number - 1);
            System.out.println(number++);
        }
    }
}
