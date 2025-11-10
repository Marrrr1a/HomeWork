package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    int counter = 0;
    public double divide (double a, double b) {
        counter +=1;
        return super.divide(a, b);
    }

    public int multiply (int a, int b) {
        counter +=1;
        return super.multiply(a, b);
    }

    public int minus (int a, int b) {
        counter +=1;
        return super.minus(a, b);
    }

    public double plus (double a, double b) {
        counter +=1;
        return super.plus(a, b);
    }

    public double degree (double a, int b) {
        counter +=1;
        return super.degree(a, b);
    }

    public double absolut(double a) {
        counter +=1;
        return super.absolut(a);
    }

    public double squareRoot(double a) {
        counter +=1;
        return super.squareRoot(a);
    }

    public long getCountOperation() {
        System.out.print("Количество использований калькулятора = ");
        return this.counter;
    }

}
