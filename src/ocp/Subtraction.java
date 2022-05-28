package ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Subtraction implements IOperation {

    private Integer firstNumber;
    private Integer secondNumber;

    @Override
    public void performOperation() {
        Integer result = firstNumber - secondNumber;
        System.out.println("Subtraction = " + result);
    }
}
