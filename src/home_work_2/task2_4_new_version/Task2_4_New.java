package home_work_2.task2_4_new_version;


import java.util.Arrays;

public class Task2_4_New {

    public static int evenAndPositive(int [] container) {
        int sum = 0;
        for (int i = 0; i < container.length; i++) {
            int element = container[i];
            if (element > 0 && element % 2 == 0) {
                sum += element;
            }
        }
        System.out.print("Сумма равна:" + sum + "\n");
        return sum;
    }


    public static int max(int[] container) {
        int element2 = -100_000_000_0;
        for (int i = 0; i < container.length; i ++) {
            int element = container[i];
            if (i % 2 == 0){
                element2 = Math.max(element,element2);
            }
        }
        System.out.print("Наибольший элемент массива с чётным индексом: " + element2 + "\n");
        return element2;
    }


    public static String lessThanMean (int[] container) {
        int sum = 0;
        int mean = 0;
        int element = 0;
        int[] container2 = new int [container.length];
        int j = 0;
        for (int i = 0; i < container.length; i++) {
            element = container[i];
            sum = sum + element;
        }
        mean = sum / (container.length);

        for (int i = 0; i < container.length; i++) {
            element = container [i];
            if (element < mean) {
                container2 [j] = element;
                j++;
            }
        }
        System.out.println(Arrays.toString(container2));
        return Arrays.toString(container2);
    }


    public static int min (int[] container) {
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
        return min1 & min2;
    }


    public static int delete (int[] container, int min, int max) {
        int element = 0;

        for (int i = 0; i < container.length; i++) {
            element = container[i];
            if (element >= min && element <= max) {
                element = container[container.length - 1];
                container[container.length-1] = 0;
            }
            System.out.print(element + " ");
        }
        return 0;
    }
}
