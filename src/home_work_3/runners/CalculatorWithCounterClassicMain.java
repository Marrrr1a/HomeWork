package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculator = new CalculatorWithCounterClassic();
        CalculatorWithCounterClassic count = new CalculatorWithCounterClassic();

        double result1;
        double result2;
        double result3;
        double result4;
        double finalResult;

        result1 = calculator.multiply(15,7);
        count.incrementCountOperation();  //увеличение счётчика на 1

        result2 = calculator.divide(28,5);
        count.incrementCountOperation();  //увеличение счётчика на 1

        result3 = calculator.degree(result2, 2);
        count.incrementCountOperation();  //увеличение счётчика на 1

        result4 = calculator.plus(4.1,result1);
        count.incrementCountOperation();  //увеличение счётчика на 1

        finalResult = calculator.plus(result4, result3);
        count.incrementCountOperation();  //увеличение счётчика на 1

        System.out.printf("Результат = %.2f\n", finalResult);
        System.out.println(count.getCountOperation());

    }
}
