package Decorator;


import Singelton.SilgentonLoger;

public class LoggingDecorator extends Calculator {
    private final Calculator calculator;

    public LoggingDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        int result = super.add(a, b);
        SilgentonLoger.getLoger().log(String.format("%d + %d = %d", a, b, result));
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
