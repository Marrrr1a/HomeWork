package home_work_2.loops;

import java.util.Scanner;

public class Task1_1_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        long a = console.nextLong();
        if ((long) a <= 0) {
            System.out.println("Проверьте корректность введённых данных");
            return;
        }

        if (a==1){
            System.out.println("результат = 1");
            return;
        }

        long i = 1;
        long b = 1;
        while (i <= a) {
            b *= i;
            System.out.print(i + " * ");
            i++;
            if (i == a) {
                System.out.print(i);
                b *= i;
                break;
            }
        }
        System.out.print(" = " + b);
        if (b < 0) {
            System.out.println("\nпереполнение данных");
        }
    }
}
