package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIteration {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите номер задания:\n1 - вывод всех элементов в консоль,\n" +
                "2 - вывод каждого второго элемента в консоль,\n" +
                "3 - вывод в консоль всех элементов в обратном порядке");
        long point = console.nextLong();
        if (point == 1) {
            everyElement(args);
        } else if (point == 2) {
            everySecondElement(args);
        } else if (point == 3) {
            swap(args);
        }
    }

    public static void everyElement(String[] args) {
        int[] container = utils.ArraysUtils.arrayFromConsole();
        int i = 0;

        do {
            int element = container[i];
            System.out.print(element + " ");
            i++;
        }
        while (i < container.length);
        System.out.print("\n");

        i = 0;
        while (i < container.length) {
            int element = container[i];
            System.out.print(element + " ");
            i++;
        }
        System.out.print("\n");

        for (i = 0; i < container.length; i++) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n");

        for (int element : container) {
            System.out.print(element + " ");
        }
        System.out.print("\n------------");
    }
    public static void everySecondElement(String[] args) {
        int[] container = utils.ArraysUtils.arrayFromConsole();
        int i = 0;

        do {
            int element = container[i];
            System.out.print(element + " ");
            i +=2;
        }
        while (i < container.length);
        System.out.print("\n");

        i = 0;
        while (i < container.length) {
            int element = container[i];
            System.out.print(element + " ");
            i += 2;
        }
        System.out.print("\n");

        for (i = 0; i < container.length; i += 2) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n------------");
    }

    public static void swap (String[] args) {
        int[] container = utils.ArraysUtils.arrayFromConsole();
        int i = container.length - 1;

        do {
            int element = container[i];
            System.out.print(element + " ");
            i --;
        }
        while (i >= 0);
        System.out.print("\n");

        i = container.length - 1;;
        while (i >= 0) {
            int element = container[i];
            System.out.print(element + " ");
            i --;
        }
        System.out.print("\n");

        for (i = container.length - 1; i >= 0; i--) {
            int element = container[i];
            System.out.print(element + " ");
        }
        System.out.print("\n------------");

    }
}
