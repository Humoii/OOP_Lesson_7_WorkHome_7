import log.ConsoleLogger;

public class CalculableWithLogger implements ICalculableFactory{
    @Override
    public Calculable create(int primaryArg) {
        return new CalculatorDecorator(new Calculator(primaryArg), new ConsoleLogger());
    }
}
