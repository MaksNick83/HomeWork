public class TypeDataVarible {
    public static void main(String[] args) {
       /* 1.Поприветствовать любого пользователя при вводе его имени через аргумент командной строки.
        2.Отобразить в окне консоли аргументы командной строки в обратном порядке.*/
        if (args.length == 1) {//Один аргумент, приветствуем
            System.out.println("Задача №1");
            System.out.println("Привет: " + args[0]);
        } else {
            if (args.length > 1) { //
                //Несколько, выводим в обратном порядке
                System.out.println("Задача №2");
                System.out.println("Аргументы в обратном порядке:");
                for (int i = args.length - 1; i >= 0; i--) {
                    System.out.print(args[i] + " ");
                }
                System.out.println("");
            }
        }
       /* 3.Объявить массив с n-м количеством случайных чисел(используя инициализатор массива)
        и вывести числа массива один раз с переходом(столбец)и один раз без перехода на новую строку(строка).*/
        System.out.println("Задача №3");
        int[] mas = {1, 2, 3, 4, 5};
        //В одном цикле наполним две переменные одна с переводом строки, другая нет
        String s1 = "", s2 = "";
        for (int i = 0; i < mas.length; i++) {
            s1 = s1 + mas[i] + "\n";
            s2 = s2 + mas[i] + " ";
        }
        System.out.println("В строку:");
        System.out.println(s2);

        System.out.println("В столбец:");
        System.out.println(s1);


    }
}