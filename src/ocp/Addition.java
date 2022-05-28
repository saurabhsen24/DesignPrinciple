package ocp;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Addition implements IOperation {

    private Integer firstNumber;
    private Integer secondNumber;

    @Override
    public void performOperation() {
        Integer sum = firstNumber + secondNumber;
        System.out.println("Addition = " + sum);
    }
}
