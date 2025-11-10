package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();
        double result1;
        double result2;
        double finalResult;

        result1 = calculator.plus(4.1, calculator.multiply(15,7));
        result2 = calculator.degree(calculator.divide(28,5), 2);
        finalResult = calculator.plus(result1, result2 );


        System.out.printf("Результат = %.2f", finalResult);

    }
}
