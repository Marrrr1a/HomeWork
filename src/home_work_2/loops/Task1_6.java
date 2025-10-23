package home_work_2.loops;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1_6 {
    public static void main(String[] args) {
        int y = 0;
        System.out.println("Таблица умножения");
        for (int i = 2; i <= 9; i++){
            for (int x = 1; x <= 10; x++){
                y = x * i;
                System.out.println(i + " * " + x + " = " + y);
            }
            System.out.println ("------------");
        }
    }
}
