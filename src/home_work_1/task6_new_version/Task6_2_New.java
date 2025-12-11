package home_work_1.task6_new_version;

import java.util.Objects;

public class Task6_2_New implements ICommunicationPrinter {
    public String welcom (String name) {
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (Objects.equals(name, name1)) {
            System.out.println("Привет!\n" +
                    "Я тебя так долго ждал");
            return "1";
        } else if (Objects.equals(name, name2)) {
            System.out.println("Я тебя так долго ждал");
            return "2";
        } else {
            System.out.println("Добрый день, а вы кто?");
            return "3";
        }
    }
}