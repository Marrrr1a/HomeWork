package home_work_1;

import java.util.Scanner;

public class Task4_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();
        System.out.println("Введите третье число: ");
        int c = console.nextInt();

        if (a > b && a < c) {
            System.out.println("Среднее число: " + a);
        } else if (b > a && b < c) {
            System.out.println("Среднее число: " + b);
        } else if (c > a && c < b) {
            System.out.println("Среднее число: " + c);
        } else if (a < b && a > c) {
            System.out.println("Среднее число: " + a);
        } else if (b < a && b > c) {
            System.out.println("Среднее число: " + b);
        } else if (c < a && c > b) {
        System.out.println("Среднее число: " + c);
        } else {
            System.out.println("Невозможно определить среднее число");
        }
    }
}
