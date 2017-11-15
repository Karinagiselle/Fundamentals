package Excercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FibonacciTest {

    @Test
    public void fibonacciSequencefrom1to8() {
        final List<Integer> sequenceExpected = Arrays.asList(1, 1, 2, 3, 5, 8);

        List<Integer> result = Fibonacci.getSequenceFrom1To(8);

        assertThat(result).isEqualTo(sequenceExpected);
    }

    @Test
    public void fibonacciSequencefrom1to144() {
        final List<Integer> sequenceExpected = Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144);

        List<Integer> result = Fibonacci.getSequenceFrom1To(144);

        assertThat(result).isEqualTo(sequenceExpected);
    }

    @Test
    public void fibonacciSequenceTo0() {
        final List<Integer> sequenceExpected = new ArrayList<Integer>();

        List<Integer> result = Fibonacci.getSequenceFrom1To(0);

        assertThat(result).isEqualTo(sequenceExpected);
    }

    @Test
    public void fibonacciSequenceTo1() {
        final List<Integer> sequenceExpected = Arrays.asList(0);

        List<Integer> result = Fibonacci.getSequenceFrom1To(1);

        assertThat(result).isEqualTo(sequenceExpected);
    }

    @Test
    public void fibonacciSequenceTo2() {
        final List<Integer> sequenceExpected = Arrays.asList(0, 1);

        List<Integer> result = Fibonacci.getSequenceFrom1To(2);

        assertThat(result).isEqualTo(sequenceExpected);
    }
}
