package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoAgregation {

    int counter = 0;

    private final CalculatorWithMathCopy calculator;

    public CalculatorWithCounterAutoAgregation(CalculatorWithMathCopy calculator) {
        this.calculator = calculator;
    }

    public double div (double a, double b){
        counter +=1;
        return calculator.divide(a,b);
    }

    public int mltply (int a, int b){
        counter +=1;
        return calculator.multiply(a, b);
    }

    public int substract (int a, int b) {
        counter +=1;
        return calculator.minus(a, b);
    }

    public double add (double a, double b) {
        counter +=1;
        return calculator.plus(a, b);
    }

    public double dgr (double a, int b) {
        counter +=1;
        return calculator.degree(a, b);
    }

    public double abs (double a) {
        counter +=1;
        return calculator.absolut(a);
    }

    public double sqrt (double a) {
        counter +=1;
        return calculator.squareRoot(a);
    }

    public long getCountOperation() {
        System.out.print("Количество использований калькулятора = ");
        return this.counter;
    }

}
