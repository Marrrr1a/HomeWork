package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculator = new CalculatorWithCounterAutoSuper();

        double result1;
        double result2;
        double result3;
        double result4;
        double finalResult;

        result1 = calculator.multiply(15,7);

        result2 = calculator.divide(28,5);

        result3 = calculator.degree(result2, 2);

        result4 = calculator.plus(4.1,result1);

        finalResult = calculator.plus(result4, result3);

        System.out.printf("Результат = %.2f\n", finalResult);
        System.out.println(calculator.getCountOperation());

    }
}
