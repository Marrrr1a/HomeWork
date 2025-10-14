package home_work_1;

import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите код");
        int a = console.nextInt();


        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
            System.out.println("Это код буквы английского алфавита: " + (char)a);
        } else {
            System.out.println("Это код символа: " + (char)a);
        }
    }
}
