package DesignPatterns.Behavioral;

public class ArithmeticalOperation {

    Operation operation;

    ArithmeticalOperation(Operation operation) {
        this.operation = operation;
    }

    public int executeOperation(int number1, int number2) {
        return operation.executeOperation(number1, number2);
    }
}
