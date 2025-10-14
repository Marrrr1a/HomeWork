package home_work_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = console.nextInt();         //пример: число 36 - 100100
        System.out.println("Введите второе число: ");
        int b = console.nextInt();         //пример: число 49 - 110001
        int c = a & b;    //100100 - первое число
 //                         110001 - второе число
 //                         100000 - результат (число 32)
        System.out.println("Результат побитовой операции И: " + c);
        int d = a | b;    //100100 - первое число
 //                         110001 - второе число
 //                         110101 - результат (число 53)
        System.out.println("Результат побитовой операции ИЛИ: " + d);
    }
}
