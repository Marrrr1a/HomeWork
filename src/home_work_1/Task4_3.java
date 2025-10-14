package home_work_1;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();
        System.out.println("Введите второе число: ");
        int b = console.nextInt();
        if (b == 0) {
            System.out.println("Деление на 0 невозможно");
        }

        int c = a % b;

        if (c == 0) {
            System.out.println("Первое число делится на второе без остатка. Частное: " + a / b);
        } else {
            System.out.println("Первое число не делится на второе без остатка. Частное : " + a / b + "; остаток : " + c);
        }

    }
}
