package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        double a = (Math.PI/3);
        double b = (Math.PI/6);
        double c = Math.cos(a);
        double d = Math.sin(b);
        int x = 2;
        int y = 45;
        System.out.println("Косинус угла 60 градусов равен: " + c);
        System.out.println("Cинус угла 30 градусов равен: " + d);
        long f = Math.round(a);
        System.out.println("Результат округления: " + f);
        System.out.println("Случайное число от 0.0 до 1.0 = " + Math.random());
        System.out.println("Возведение числа a в степень b: " + Math.pow(a , b));
        System.out.println("Наибольшее значение из перечисленных: " + Math.max(x,y));

    }

}
