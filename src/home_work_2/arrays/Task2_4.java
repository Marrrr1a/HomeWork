package home_work_2.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите номер задания:\n1 - сумма чётных и положительных элементов массива,\n" +
                "2 - наибольший элемент массива с чётным индексом,\n" +
                "3 - элементы, которые меньше среднего арифметического,\n" +
                "4 - два наименьших элемента массива,\n" +
                "5 - удаление элементов из диапазона");
        long point = console.nextLong();
        if (point == 1) {
            evenAndPositive(args);
        } else if (point == 2) {
            max(args);
        } else if (point == 3) {
            lessThanMean(args);
        } else if (point == 4) {
            min(args);
        } else if (point == 5) {
            delete(args);
        }
    }


    public static void evenAndPositive(String[] args) {
        int[] container = utils.ArraysUtils.arrayRandom(50, 100);
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element > 0 && element % 2 == 0) {
                sum += element;
            }
        }
        System.out.print("Сумма равна:" + sum + "\n");
    }


    public static void max(String[] args) {
        int[] container = utils.ArraysUtils.arrayRandom(50,100);
        int element = 0;
        int element2 = 0;
        for (int i = 0; i < container.length; i += 2) {
            element = container[i];
            element2 = container[container.length - 1];
            if (element > element2) {
                element2 = element;
            }
        }
        System.out.print("Наибольший элемент массива с чётным индексом: " + element2 + "\n");
    }


    public static void lessThanMean (String[] args) {
        int[] container = utils.ArraysUtils.arrayRandom(50,100);
        int sum = 0;
        int mean = 0;
        int element = 0;
        for (int i = 0; i < container.length; i ++) {
            element = container[i];
            sum = sum + element;
            }
        mean = sum / (container.length);
        for (int i = 0; i < container.length; i ++) {
            element = container [i];
            if (element < mean) {
                System.out.println(element + " ");
            }
        }
    }


    public static void min (String[] args) {
        int[] container = utils.ArraysUtils.arrayRandom(50,100);
        int min1 = container[0];
        int min2 = container[1];
        for (int i = 2; i < container.length; i++) {
            if (min2 > container[i]) {
                min2 = container[i];
            }
            if (min2 < min1) {
                int tmp = min2;
                min2 = min1;
                min1 = tmp;
            }
        }
        System.out.println("два наименьших элемента массива: " + min1 + " " + min2);
    }


    public static void delete (String[] args) {
        int[] container = utils.ArraysUtils.arrayRandom(50,100);
        Scanner console = new Scanner(System.in);
        System.out.println("Введите начало диапазона");
        int min = console.nextInt();
        console = new Scanner(System.in);
        System.out.println("Введите конец диапазона");
        int max = console.nextInt();
        int element = 0;


        for (int i = 0; i < container.length; i++) {
            element = container[i];
            if (element >= min && element <= max) {
                element = container[container.length - 1];
                container[container.length-1] = 0;
            }
            System.out.print(element + " ");
        }
    }
}
