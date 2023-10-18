import log.Loggable;

public class CalculatorDecorator implements Calculable{
    Calculable calculator;
    Loggable logger;

    public CalculatorDecorator(Calculable calculator, Loggable logger) {
        this.calculator = calculator;
        this.logger = logger;
    }

    @Override
    public Calculable sum(int arg) {
        Calculable result = calculator.sum(arg);
        return result;
    }

    @Override
    public Calculable multi(int arg) {
        Calculable result = calculator.multi(arg);
        return result;
    }

    @Override
    public int getResult() {
        return calculator.getResult();
    }
}
