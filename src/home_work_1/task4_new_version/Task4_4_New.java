package home_work_1.task4_new_version;


public class Task4_4_New {
    public static int bytesToKb(int a, String b) {

        if (b.equalsIgnoreCase("байты") || b.equalsIgnoreCase("байт")) {
            System.out.println(a + " килобайт(а) = " + a*1024 + " байт(а)");
            return 0;
        } else if (b.equalsIgnoreCase("килобайты") || b.equalsIgnoreCase("килобайт")){
            System.out.println(a + " байт(а) = " + a/1024 + " килобайт(а)");
            return 1;
        } else {
            System.out.println("Проверьте корректность введённого запроса");
            return 2;
        }
    }
}
