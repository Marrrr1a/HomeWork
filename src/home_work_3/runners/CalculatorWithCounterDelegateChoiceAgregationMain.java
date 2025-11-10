package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiseAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {

        CalculatorWithOperator calculatorOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorMathExtends = new CalculatorWithMathExtends();

        CalculatorWithCounterAutoChoiseAgregation calc = new CalculatorWithCounterAutoChoiseAgregation(calculatorOperator, calculatorMathCopy, calculatorMathExtends);

        double result1_1 = calc.mltply1(15,7);

        double result2_1 = calc.div1(28,5);

        double result3_1 = calc.dgr1(result2_1,2);

        double result4_1 = calc.add1(4.1, result1_1);

        double finalResult1 = calc.add1(result3_1, result4_1);

        System.out.printf("Результат = %.2f\n", finalResult1);
        System.out.println(calc.getCountOperation());


        double result1_2 = calc.mltply2(15,7);

        double result2_2 = calc.div2(28,5);

        double result3_2 = calc.dgr2(result2_2,2);

        double result4_2 = calc.add2(4.1, result1_2);

        double finalResult2 = calc.add2(result3_2, result4_2);

        System.out.printf("Результат = %.2f\n", finalResult2);
        System.out.println(calc.getCountOperation());


        double result1_3 = calc.mltply2(15,7);

        double result2_3 = calc.div2(28,5);

        double result3_3 = calc.dgr2(result2_3,2);

        double result4_3 = calc.add2(4.1, result1_3);

        double finalResult3 = calc.add2(result3_3, result4_3);

        System.out.printf("Результат = %.2f\n", finalResult3);
        System.out.println(calc.getCountOperation());
    }
}
