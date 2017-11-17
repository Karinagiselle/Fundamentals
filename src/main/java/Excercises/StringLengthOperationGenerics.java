package Excercises;

public class StringLengthOperationGenerics implements GenericOperation<String, Integer> {
    public Integer performOperation(String value) {
        return value.length();
    }
}
