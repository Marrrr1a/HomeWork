package home_work_1.task4_new_version;

public class Task4_2_New {
    public static int midNumber (int a, int b, int c) {

        if (a > b && a < c) {
            System.out.println("Среднее число: " + a);
            return 0;
        } else if (b > a && b < c) {
            System.out.println("Среднее число: " + b);
            return 1;
        } else if (c > a && c < b) {
            System.out.println("Среднее число: " + c);
            return 2;
        } else if (a < b && a > c) {
            System.out.println("Среднее число: " + a);
            return 3;
        } else if (b < a && b > c) {
            System.out.println("Среднее число: " + b);
            return 4;
        } else if (c < a && c > b) {
        System.out.println("Среднее число: " + c);
            return 5;
        } else {
            System.out.println("Невозможно определить среднее число");
            return 6;
        }
    }
}
