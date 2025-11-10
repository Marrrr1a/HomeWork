package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    public double divide (double a, double b) {
        return a/b;
    }

    public int multiply (int a, int b) {
        return a*b;
    }

    public int minus (int a, int b) {
        return a-b;
    }

    public double plus (double a, double b) {
        return a+b;
    }

    public double degree (double a, int b) {
        return Math.pow(a,b);
    }

    public double absolut (double a) {
        return Math.abs(a);
    }

    public double squareRoot (double a) {
        return Math.sqrt(a);
    }

}
