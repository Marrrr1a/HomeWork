package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator{

    ICalculator intrfc;
    public CalculatorWithCounterAutoAgregationInterface (ICalculator intrfc){
        this.intrfc = intrfc;
    }

    private int counter = 0;

    @Override
    public double divide(double a, double b) {
        counter +=1;
        return intrfc.divide(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        counter +=1;
        return intrfc.multiply(a, b);
    }

    @Override
    public int minus(int a, int b) {
        counter +=1;
        return intrfc.minus(a, b);
    }

    @Override
    public double plus(double a, double b) {
        counter +=1;
        return intrfc.plus(a, b);
    }

    @Override
    public double degree(double a, int b) {
        counter +=1;
        return intrfc.degree(a, b);
    }

    @Override
    public double absolut(double a) {
        counter +=1;
        return intrfc.absolut(a);
    }

    @Override
    public double squareRoot(double a) {
        counter +=1;
        return intrfc.squareRoot(a);
    }

    public long getCountOperation() {
        System.out.print("Количество использований калькулятора = ");
        return this.counter;
    }
}
