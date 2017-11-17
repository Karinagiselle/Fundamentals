package Excercises;

public class AddOneOperationGeneric implements GenericOperation<Integer, Integer> {
    public Integer performOperation(Integer value) {
        return value + 1;
    }
}
