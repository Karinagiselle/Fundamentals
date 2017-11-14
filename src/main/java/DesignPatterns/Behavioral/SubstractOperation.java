package DesignPatterns.Behavioral;

public class SubstractOperation implements Operation {
    public int executeOperation(int number1, int number2) {
        return number1 - number2;
    }
}
