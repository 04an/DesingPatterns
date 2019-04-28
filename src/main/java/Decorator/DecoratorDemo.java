package Decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(3, 5);

        calculator = new LoggingDecorator(calculator);
        calculator.add(2,2);

        calculator= new DecoratorLoggerStartEnd(calculator);
        calculator.add(2,2);
    }
}
