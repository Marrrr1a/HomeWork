package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год: ");
        int a = console.nextInt();

        if (a % 100 == 0 && a % 400 != 0) {
            System.out.println("Год является невисокосным");
        } else if (a % 4 == 0){
            System.out.println("Год является високосным");
        }
    }
}
