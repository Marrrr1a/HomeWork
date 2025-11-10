package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiseAgregation {

    int counter = 0;

    private final CalculatorWithOperator calculatorOperator;
    private final CalculatorWithMathCopy calculatorMathCopy;
    private final CalculatorWithMathExtends calculatorMathExtends;

    public CalculatorWithCounterAutoChoiseAgregation(CalculatorWithOperator calculatorOperator, CalculatorWithMathCopy calculatorMathCopy, CalculatorWithMathExtends calculatorMathExtends) {
        this.calculatorOperator = calculatorOperator;
        this.calculatorMathCopy = calculatorMathCopy;
        this.calculatorMathExtends = calculatorMathExtends;
    }

    public double div1 (double a, double b){
        counter +=1;
        return calculatorOperator.divide(a,b);
    }

    public int mltply1 (int a, int b){
        counter +=1;
        return calculatorOperator.multiply(a, b);
    }

    public int substract1 (int a, int b) {
        counter +=1;
        return calculatorOperator.minus(a, b);
    }

    public double add1 (double a, double b) {
        counter +=1;
        return calculatorOperator.plus(a, b);
    }

    public double dgr1 (double a, int b) {
        counter +=1;
        return calculatorOperator.degree(a, b);
    }

    public double abs1 (double a) {
        counter +=1;
        return calculatorOperator.absolut(a);
    }

    public double sqrt1 (double a) {
        counter +=1;
        return calculatorOperator.squareRoot(a);
    }




    public double div2 (double a, double b){
        counter +=1;
        return calculatorMathCopy.divide(a,b);
    }

    public int mltply2 (int a, int b){
        counter +=1;
        return calculatorMathCopy.multiply(a, b);
    }

    public int substract2 (int a, int b) {
        counter +=1;
        return calculatorMathCopy.minus(a, b);
    }

    public double add2 (double a, double b) {
        counter +=1;
        return calculatorMathCopy.plus(a, b);
    }

    public double dgr2 (double a, int b) {
        counter +=1;
        return calculatorMathCopy.degree(a, b);
    }

    public double abs2 (double a) {
        counter +=1;
        return calculatorMathCopy.absolut(a);
    }

    public double sqrt2 (double a) {
        counter +=1;
        return calculatorMathCopy.squareRoot(a);
    }




    public double div3 (double a, double b){
        counter +=1;
        return calculatorMathExtends.divide(a,b);
    }

    public int mltply3 (int a, int b){
        counter +=1;
        return calculatorMathExtends.multiply(a, b);
    }

    public int substract3 (int a, int b) {
        counter +=1;
        return calculatorMathExtends.minus(a, b);
    }

    public double add3 (double a, double b) {
        counter +=1;
        return calculatorMathExtends.plus(a, b);
    }

    public double dgr3 (double a, int b) {
        counter +=1;
        return calculatorMathExtends.degree(a, b);
    }

    public double abs3 (double a) {
        counter +=1;
        return calculatorMathExtends.absolut(a);
    }

    public double sqrt3 (double a) {
        counter +=1;
        return calculatorMathExtends.squareRoot(a);
    }


    public long getCountOperation() {
        System.out.print("Количество использований калькулятора = ");
        return this.counter;
    }

}
