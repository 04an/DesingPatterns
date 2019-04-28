package Decorator;

import Singelton.SilgentonLoger;

public class DecoratorLoggerStartEnd extends Calculator {
    private final Calculator calculator;

    public DecoratorLoggerStartEnd (Calculator calculator){
        this.calculator= calculator;
    }

    @Override
    public int add(int a, int b) {
        SilgentonLoger.getLoger().log("Start method");
        int result = calculator.add(a,b);
        SilgentonLoger.getLoger().log("Koniec method");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        return super.subtract(a, b);
    }

    @Override
    public int multiply(int a, int b) {
        return super.multiply(a, b);
    }

    @Override
    public double divide(double a, double b) {
        return super.divide(a, b);
    }

    @Override
    public boolean isEven(int number) {
        return super.isEven(number);
    }

    @Override
    public boolean isOdd(int number) {
        return super.isOdd(number);
    }
}
