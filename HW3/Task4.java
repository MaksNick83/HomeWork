public class Task4 {
    public static void main(String[] args) {
        int k = 2;
        int index = 1;
        for (int i = 0; i * i < k; i++) {
            for (int j = 0; j * j < k; j++) {
                System.out.print((index > k ? 0 : index++) + " ");
            }
            System.out.println();
        }
    }
}