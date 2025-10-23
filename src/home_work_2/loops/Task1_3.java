package home_work_2.loops;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, которое хотите возвести в степень ");
        String number = console.nextLine();
        System.out.println("Введите степень (целое, положительное число) ");
        String degree = console.nextLine();

        int a = degree.indexOf(".");
        int b = degree.indexOf(",");
        int m = number.indexOf(".");
        int n = number.indexOf(",");
        int n1 = 1;
        double n2 = 1;
        int d = 1;
        int y = 1;
        double z = 1;

        for (int i = 0; i < degree.length(); i++) {
            char x = degree.charAt(i);
            if (a != -1 || b != -1) {
                System.out.println("Введено не целое число для степени");
                return;
            } else {
                d = Integer.parseInt(degree);
            }
        }
        for (int i = 0; i < number.length(); i++) {
            char x = number.charAt(i);
            if (m != -1 || n != -1) {
                n2 = Double.parseDouble(number);
                for (int k = 0; k <= d; k++) {
                    z = n2 * n2;
                }
                System.out.println(z);
                return;
            } else {
                n1 = Integer.parseInt(number);
                for (int j = 0; j <= d; j++) {
                    y = n1 * n1;
                }
                System.out.println(y);
                return;
            }
        }
    }
}
