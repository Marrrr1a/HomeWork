package home_work_1.task4_new_version;

public class Task4_6_New {
    public static String whatYear (int a) {

        if (a % 100 == 0 && a % 400 != 0) {
            return "Год является невисокосным";
        } else if (a % 4 == 0){
            return "Год является високосным";
        } else
        return "Год является невисокосным";
    }
}
