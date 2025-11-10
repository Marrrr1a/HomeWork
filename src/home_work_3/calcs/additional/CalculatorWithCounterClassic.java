package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    int counter = 0;
    public void incrementCountOperation(){
        counter += 1;
    }

    public long getCountOperation() {
        System.out.print("Количество использований калькулятора = ");
        return this.counter;
    }
}
