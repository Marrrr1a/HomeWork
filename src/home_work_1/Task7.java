package home_work_1;

public class Task7 {
    public static void main(String[] args) {
        int [] container = {0,1,2,3,4,5,6,7,8,9};
        Task7.createPhoneNumber(container);
    }
    public static void createPhoneNumber(int [] container) {
        System.out.println("(" + container[0] + container[1] + container[2] + ") " + container[3] +
                container[4] + container[5] + "-" + container[6] + container[7] + container[8] + container [9]);
    }
}
