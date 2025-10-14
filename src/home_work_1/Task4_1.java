package home_work_1;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();

        boolean c = a % 2 != 0;
        boolean d = b % 2 != 0;

        if (c && d) {
            System.out.println("Оба числа нечётные");
        } else if (c) {
            System.out.println("Нечётное число: " + a);
        } else if (d) {
            System.out.println("Нечётное число: " + b);
        } else {
            System.out.println("Оба числа чётные");
        }
    }
}
