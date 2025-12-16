package home_work_2.task1_new_version;

import java.util.Random;

public class Task1_New {
    public static long mltplyLoop(double a) {

        if (a <= 0) {
            System.out.println("Проверьте корректность введённых данных");
            return 0;
        }

        if (a==1){
            System.out.println("результат = 1");
            return 1;
        }

        double residual = (a*10)%10;
        if (residual != 0) {
            System.out.println("Введено не целое число");
            return 2;
        }

        long i = 1;
        long b = 1;
        while (i <= a) {
            b *= i;
            System.out.print(i + " * ");
            i++;
            if (i == a) {
                System.out.print(i);
                b *= i;
                break;
            }
        }
        System.out.print(" = " + b);
        if (b < 0) {
            System.out.println("\nпереполнение данных");
            return 3;
        }
        return b;
    }


    public static int mltplyDigits (String number) {

        int a = number.indexOf(".");
        int b = number.indexOf(",");
        int c;
        int d = number.indexOf("-");
        int result = 1;

        for (int i = 0; i < number.length(); i++) {
            char x = number.charAt(i);
            if (a != -1 || b != -1) {
                System.out.println("Введено не целое число");
                return 0;
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
            } else if (d != -1){
                System.out.println("Введено отрицательное число");
                return 1;
            } else {
                System.out.println("Введено не число ");
                return 2;
            }
        }
        System.out.print(" = " + result);
        return result;
    }

    public static double degree (String number, String degree) {

        int a = degree.indexOf(".");
        int b = degree.indexOf(",");
        int c = degree.indexOf("-");
        int m = number.indexOf(".");
        int n = number.indexOf(",");
        int n1 = 1;
        double n2 = 1;
        int d = 1;
        double y = 1;
        double z = 1;

        for (int i = 0; i < degree.length(); i++) {
            if (a != -1 || b != -1) {
                System.out.println("Введено не целое число для степени");
                return 1;
            } else {
                if (c != -1){
                    String newDegree = degree.replace("-", "");
                    d = Integer.parseInt(newDegree);
                } else {
                    d = Integer.parseInt(degree);
                }
            }
        }


        if (m != -1 || n != -1) {
            String newNumber = number.replace(",",".");
            n2 = Double.parseDouble(newNumber);

            for (int k = 0; k < d; k++) {
                z = n2 * z;
            }
            if (c != -1 && z != 0){
                z = 1/z;
            }
            System.out.println(z);
            return z;
        } else {
            n1 = Integer.parseInt(number);

            for (int j = 0; j < d; j++) {
                y = n1 * y;
            }
            if (c != -1 && y != 0){
                y = 1/y;
            }
            System.out.println(y);
            return y;
        }
    }

    public static long max (long number) {
        long result = -1;
        if (number == 0){
            result = 0;
        }
        if (number < 0){
            number = number * (-1);
        }

        while (number > 0) {
            long tmp = number % 10;
            if (tmp > result) {
                result = tmp;
            }
            number = number / 10;
        }
        System.out.println("Максимальная цифра = " + result);
        return result;
    }


    public static float random () {
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
        return 1;
    }


    public static long even (long number) {

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
        return result & result1;
    }


    public static int fibonacci (long number) {

        int x = 1;
        int z = 2;
        int tmp;

        if (number < 0) {
            System.out.println("Введено отрицательное значение");
            return -1;
        }
        if (number == 0) {
            System.out.println("Введён ноль");
            return -2;
        }
        System.out.print("Ряд Фибоначчи: " + x + " " + z + " ");
        for (int i = 3; i <= number; i++) {
            tmp = x;
            x = z;
            z = tmp + x;
            System.out.print(z + " ");
        }
        return z;
    }


    public static long range (long min, long max, long argument) {

        if (min < 0 || max < 0){
            System.out.println("Границы диапазона не могут быть отрицательными");
            return 5;
        }

        if (min > max){
            System.out.println("Минимальное значение диапазона не может быть больше максимального");
            return 1;
        }

        if (argument == 0){
            System.out.println("Шаг не может быть равен нулю");
            return 2;
        }

        if (argument > max){
            System.out.println("Шаг не может быть больше максимального значения диапазона");
            return 3;
        }

        if (argument < 0){
            System.out.println("Шаг не может быть отрицательным");
            return 4;
        }


        for (long i = min; i <= max; i += argument) {
            System.out.print(i + " ");
        }
        return 0;
    }


    public static long swap (long number) {

        if (number < 0){
            number = number * (-1);
        }

        long number2 = 0;
        while (number > 0) {
            long tmp = number % 10;
            number2 = number2 * 10 + tmp;
            number = number / 10;
        }
        System.out.println("Перевёрнутое число: " + number2);
        return number2;
    }
}
