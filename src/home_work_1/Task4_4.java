package home_work_1;

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = console.nextInt();
        System.out.println("Перевести в байты или в килобайты? ");
        console = new Scanner(System.in);
        String b = console.nextLine();

        if (b.equalsIgnoreCase("байты") || b.equalsIgnoreCase("байт")) {
            System.out.println(a + " килобайт(а) = " + a/1024 + " байт(а)");
        } else if (b.equalsIgnoreCase("килобайты") || b.equalsIgnoreCase("килобайт")){
            System.out.println(a + " байт(а) = " + a*1024 + " килобайт(а)");
        } else {
            System.out.println("Проверьте корректность введённого запроса");
        }
    }
}
