package utils;

import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {
    public static int[] arrayFromConsole() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = console.nextInt();
        int [] result = new int[size];
        for (int i = 0; i < size; i++) {
            Scanner console1 = new Scanner(System.in);
            System.out.println("Введите элемент массива №" + i);
            result [i] = console1.nextInt();
        }
        return result;
    }

    public static int [] arrayRandom (int size, int maxValueExclusion) {
        int [] result = new int[size];

        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            result[i] = rand.nextInt(maxValueExclusion);
        }
        return result;
    }
}