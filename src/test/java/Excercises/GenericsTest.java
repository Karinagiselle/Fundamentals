package Excercises;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericsTest {

    @Test
    public void add1ToAListOfNumbers() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> listOfNumbersExpeted = Arrays.asList(2, 3, 4, 5);

        List<Integer> result = Generics.updateList(listOfNumbers, new AddOneOperation());

        assertThat(result).isEqualTo(listOfNumbersExpeted);
    }

    @Test
    public void stringLengthOperation() {

        List<String> listOfWords = Arrays.asList("word", "asdqww", "asdaqff");
        List<Integer> listExpected = Arrays.asList(4, 6, 7);

        List<Integer> result = Generics.updateList(listOfWords, new StringLengthOperationGenerics());

        assertThat(result).isEqualTo(listExpected);
    }

    @Test
    public void add1ToAListOfNumbersUsingGenerics() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> listOfNumbersExpeted = Arrays.asList(2, 3, 4, 5);

        List<Integer> result = Generics.updateList(listOfNumbers, new AddOneOperationGeneric());

        assertThat(result).isEqualTo(listOfNumbersExpeted);
    }
}
