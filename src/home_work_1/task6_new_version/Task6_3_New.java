package home_work_1.task6_new_version;

public class Task6_3_New implements ICommunicationPrinter {
    public String welcom (String name) {

        switch (name) {
            case ("Вася"):
                System.out.println("Привет!\n" + "Я тебя так долго ждал");
                return "1";
            case ("Анастасия"):
                System.out.println("Я тебя так долго ждал");
                return "2";
            default:
                System.out.println("Добрый день, а вы кто?");
                return "3";
        }
    }
}