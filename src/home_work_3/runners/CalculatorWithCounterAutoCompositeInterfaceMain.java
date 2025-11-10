package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calcMath = new CalculatorWithMathCopy();
        CalculatorWithCounterAutoAgregationInterface calculator = new CalculatorWithCounterAutoAgregationInterface(calcMath);

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
