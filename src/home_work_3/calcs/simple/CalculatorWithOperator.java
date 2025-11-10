package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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
        double c = 1;
        for (int i = 1; i <= b; i++){
            c = c * a;
        }
        return c;
    }

    public double absolut (double a) {
        if (a < 0){
            return a * -1;
        } else {
            return a;
        }
    }

    public double squareRoot (double a) {
        return Math.sqrt(a);
    }


}
