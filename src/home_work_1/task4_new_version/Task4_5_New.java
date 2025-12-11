package home_work_1.task4_new_version;

public class Task4_5_New {
    public static int isLetter (int a) {

        if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
            System.out.println("Это код буквы английского алфавита: " + (char)a);
            return 0;
        } else {
            System.out.println("Это код символа: " + (char)a);
            return 1;
        }
    }
}
