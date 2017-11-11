package SortingAlgorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * The worst case, when you want to sort a list that is already sorted in reverse order, is a performance of O(n2):
 * For each iteration, you are only switching one element. The best case is when a list is already sorted:
 * You make one pass through the list, and because you have not switched any elements, you can stop.
 * This has a perfor- mance of O(n).
 **/
public class BubbleSort {

    @Test
    public void bubbleSortTest() {

        final int[] numbers = {5, 2, 6, 1, 3, 8, 9, 4};
        final int[] expected = {1, 2, 3, 4, 5, 6, 8, 9};

        bubbleSort(numbers);

        assertThat(numbers).isEqualTo(expected);
    }

    private void bubbleSort(int[] numbers) {

        boolean numberSwitched;
        do {
            numberSwitched = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int aux = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = aux;
                    numberSwitched = true;
                }
            }
        } while (numberSwitched);

    }
}
