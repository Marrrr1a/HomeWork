package home_work_3.runners;

public class WithoutCalculatorMain {
    public static void main(String[] args) {
        double a = 4.1;
        int b = 5;
        int c = 7;

        double degree = ((double) 4*c / b) * ((double) 4*c / b);   //результат = 31.36
        double result = a + 3*b * c + degree;  //результат = 140.46
        System.out.printf("Результат: %.2f",result);
    }
}
