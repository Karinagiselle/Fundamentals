package SearchingAlgorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearch {

    @Test
    public void binarySearchNotFoundValueTest() {
        final List<Integer> numbers = Arrays.asList(5, 2, 6, 1, 3, 8, 9, 4);
        final int value = 20;

        boolean found = binarySearch(numbers, value);

        assertThat(found).isFalse();
    }

    @Test
    public void binarySearchFoundValueTest() {
        final List<Integer> numbers = Arrays.asList(5, 2, 6, 1, 3, 8, 9, 4);
        final int value = 9;

        boolean found = binarySearch(numbers, value);

        assertThat(found).isTrue();
    }

    private boolean binarySearch(List<Integer> numbers, int value) {

        if (numbers == null || numbers.isEmpty()) {
            return false;
        }

        final int middleValue = numbers.get(numbers.size() / 2);

        if (value == middleValue) {
            return true;
        }

        if (value < middleValue) {
            return binarySearch(numbers.subList(0, numbers.size() / 2), value);
        } else {
            return binarySearch(numbers.subList(numbers.size() / 2 + 1, numbers.size()), value);
        }
    }
}
