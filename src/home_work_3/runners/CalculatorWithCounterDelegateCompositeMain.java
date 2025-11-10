package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoComposite calc = new CalculatorWithCounterAutoComposite();

        double result1 = calc.mltply(15,7);

        double result2 = calc.div(28,5);

        double result3 = calc.dgr(result2,2);

        double result4 = calc.add(4.1, result1);

        double finalResult = calc.add(result3, result4);

        System.out.printf("Результат = %.2f\n", finalResult);
        System.out.println(calc.getCountOperation());
    }
}
