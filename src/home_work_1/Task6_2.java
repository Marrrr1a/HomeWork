package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class Task6_2 {
    public static void main(String[] args) {
        String name1 = "Вася";
        String name2 = "Анастасия";
        System.out.println("Введите Ваше имя");
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();

        if (Objects.equals(name, name1)) {
            System.out.println("Привет!\n" +
                    "Я тебя так долго ждал");
        } else if (Objects.equals(name, name2)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}