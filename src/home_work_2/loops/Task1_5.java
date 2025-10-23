package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Выберите номер задания:\n1 - наибольшая цифра,\n" +
                "2 - вероятность чётных случайных чисел,\n" +
                "3 - количество чётных/нечётных цифр в числе,\n" +
                "4 - ряд Фибоначчи,\n" +
                "5 - ряд чисел в диапазоне с шагом,\n" +
                "6 - переворот числа");
        long point = console.nextLong();
        if (point == 1) {
            max(args);
        } else if (point == 2) {
            random(args);
        } else if (point == 3) {
            even(args);
        } else if (point == 4) {
            fibonacci(args);
        } else if (point == 5) {
            range(args);
        } else if (point == 6) {
            swap(args);
        }
    }


    public static void max(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number = console.nextLong();

        long result = -1;

        while (number > 0) {
            long tmp = number % 10;
            if (tmp > result) {
                result = tmp;
            }
            number = number / 10;
        }
        System.out.println("Максимальная цифра = " + result);
    }


    public static void random(String[] args) {
        int number = 0;
        float z;
        Random rand = new Random();
        for (int i = 0; i <= 1000; i++) {
            int x = rand.nextInt(1000);
            if (x % 2 == 0) {
                number += 1;
            }
        }
        z = ((float) number / 1000) * 100;
        System.out.println("Вероятность = " + z);
    }


    public static void even(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number = console.nextLong();

        long result = 0;
        long result1 = 0;

        while (number > 0) {
            long tmp = number % 10;
            if (tmp % 2 == 0) {
                result = result + 1;
                System.out.println(tmp + " четное");
            }
            if (tmp % 2 != 0) {
                result1 = result1 + 1;
                System.out.println(tmp + " нечетное");
            }
            number = number / 10;
        }
        System.out.println("Количество четных цифр = " + result);
        System.out.println("Количество нечетных цифр = " + result1);
    }


    public static void fibonacci(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов ряда");
        long number = console.nextLong();
        int x = 1;
        int z = 2;
        int tmp;
        System.out.print("Ряд Фибоначчи: " + x + " " + z + " ");
        for (int i = 3; i <= number; i++) {
            tmp = x;
            x = z;
            z = tmp + x;
            System.out.print(z + " ");
        }
    }


    public static void range(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите минимум");
        long min = console.nextLong();
        System.out.println("Введите максимум");
        long max = console.nextLong();
        System.out.println("Введите шаг");
        long argument = console.nextLong();
        for (long i = min; i <= max; i += argument) {
            System.out.print(i + " ");
        }
    }


    public static void swap(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число");
        long number = console.nextLong();
        long number2 = 0;
        while (number > 0) {
            long tmp = number % 10;
            number2 = number2 * 10 + tmp;
            number = number / 10;
        }
        System.out.println("Перевёрнутое число: " + number2);
    }
}

