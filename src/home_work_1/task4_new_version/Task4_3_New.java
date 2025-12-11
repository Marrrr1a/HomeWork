package home_work_1.task4_new_version;

public class Task4_3_New {
    public static int divide (int a, int b) {
        if (b == 0) {
            System.out.println("Деление на 0 невозможно");
            return 0;
        }

        int c = a % b;

        if (c == 0) {
            System.out.println("Первое число делится на второе без остатка. Частное: " + a / b);
            return 1;
        } else {
            System.out.println("Первое число не делится на второе без остатка. Частное : " + a / b + "; остаток : " + c);
            return 2;
        }
    }
}
