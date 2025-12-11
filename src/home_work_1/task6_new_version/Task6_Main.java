package home_work_1.task6_new_version;

public class Task6_Main {
    public static void main(String[] args) {
        ICommunicationPrinter ifElse = new Task6_1_New();

        String name1 = "Вася";
        ifElse.welcom(name1);

        System.out.println("\n-------------\n");

        ICommunicationPrinter ifElseIf = new Task6_2_New();
        String name2 = "Анастасия";
        ifElseIf.welcom(name2);

        System.out.println("\n-------------\n");

        ICommunicationPrinter switch3 = new Task6_3_New();
        String name3 = "Петя";
        switch3.welcom(name3);

    }
}
