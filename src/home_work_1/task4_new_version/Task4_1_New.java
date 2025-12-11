package home_work_1.task4_new_version;

public class Task4_1_New {

    public static int oddNumber(int a, int b){
        boolean c = a % 2 != 0;
        boolean d = b % 2 != 0;

        if (c && d) {
            System.out.println("Оба числа нечётные");
            return 0;
        } else if (!c && !d) {
            System.out.println("Оба числа чётные");
            return 1;
        } else if (c) {
            System.out.println("Нечётное число: " + a);
            return 2;
        } else if (d) {
            System.out.println("Нечётное число: " + b);
            return 3;
        }
        return a;
    }
}
