package ocp;

public class SimpleCalculator implements ICalculator {
    @Override
    public void calculate(IOperation operation) {
        operation.performOperation();
    }
}
