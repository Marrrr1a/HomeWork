package home_work_2.loops;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        String number = console.nextLine();

        int a = number.indexOf(".");
        int b = number.indexOf(",");
        int c;
        int result = 1;

        for (int i = 0; i < number.length(); i++) {
            char x = number.charAt(i);
            if (a != -1 || b != -1) {
                System.out.println("Введено не целое число");
                return;
            } else if (x >= '0' && x <= '9') {
                c = Integer.parseInt(number);
                int residual = c % 10;
                while (c > 0) {
                    residual = c % 10;
                    c = c / 10;
                    if (c == 0) {
                        System.out.print(residual);
                        result *= residual;
                        break;
                    }
                    System.out.print(residual + " * ");
                    result *= residual;
                }
                break;
            } else {
                System.out.println("Введено не число ");
                return;
            }
        }
        System.out.print(" = " + result);
    }
}
