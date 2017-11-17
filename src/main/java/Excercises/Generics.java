package Excercises;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static <A, B> List<B> updateList(List<A> list, GenericOperation<A, B> operation) {
        List<B> result = new ArrayList<B>(list.size());

        for (A number : list) {
            result.add(operation.performOperation(number));
        }
        return result;
    }

    public static List<Integer> updateList(List<Integer> list, IntegerOperation operation) {
        List<Integer> result = new ArrayList<Integer>(list.size());

        for (Integer number : list) {
            result.add(operation.performOperation(number));
        }
        return result;
    }
}
