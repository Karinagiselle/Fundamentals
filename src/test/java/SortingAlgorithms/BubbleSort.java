package SortingAlgorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BubbleSort {

    @Test
    public void bubbleSortTest() {

        final int[] numbers = {5, 2, 6, 1, 3, 8, 9, 4};
        final int[] expected = {1, 2, 3, 4, 5, 6, 8, 9};

        bubbleSort(numbers);

        assertThat(numbers).isEqualTo(expected);
    }

    private void bubbleSort(int[] numbers) {

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }
    }
}
