package SortingAlgorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSort {

    @Test
    public void insertSortTest() {

        final List<Integer> numbers = Arrays.asList(5, 2, 6, 1, 3, 8, 9, 4);
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);

        List<Integer> sortedList = quickSort(numbers);

        assertThat(sortedList).isEqualTo(expected);
    }

    private List<Integer> quickSort(List<Integer> numbers) {

        if (numbers.size() < 2) {
            return numbers;
        }

        Integer pivot = numbers.get(0);
        List<Integer> lower = new ArrayList<Integer>();
        List<Integer> higher = new ArrayList<Integer>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));
            }
        }

        final List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));
        return sorted;
    }

}
