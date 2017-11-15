package Excercises;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> printNumbersFrom1To(int number) {
        List<String> results = new ArrayList<String>();
        for (int i = 1; i <= number; i++) {
            String word = toWord(3, i, "Fizz") + toWord(5, i, "Buzz");
            if (StringUtils.isEmpty(word)) {
                results.add(Integer.toString(i));
            } else {
                results.add(word);
            }
        }
        return results;
    }

    public static String toWord(int divisor, int number, String word) {
        return number % divisor == 0 ? word : "";
    }
}
