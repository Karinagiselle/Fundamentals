package Excercises;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static List<Integer> getSequenceFrom1To(int number) {

        List<Integer> result = new ArrayList<Integer>();
        if (number < 0) {
            throw new IllegalArgumentException("n must not be less than zero");
        }

        result = verifyExceptionalCases(number);

        if (number != 0 && result.isEmpty()) {
            result.add(1);
            result.add(1);

            while (result.get(result.size() - 1) < number) {
                result.add(sumLastTwoNumbers(result));
            }
        }
        return result;
    }

    private static List<Integer> verifyExceptionalCases(int number) {
        List<Integer> result = new ArrayList<Integer>();
        if (number == 1) {
            result.add(0);
        } else if (number == 2) {
            result.add(0);
            result.add(1);
        }

        return result;
    }

    private static Integer sumLastTwoNumbers(List<Integer> result) {
        return result.get(result.size() - 2) + result.get(result.size() - 1);
    }
}
