package SortingAlgorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertSort {

    @Test
    public void insertSortTest() {

        final List<Integer> numbers = Arrays.asList(5, 2, 6, 1, 3, 8, 9, 4);
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);

        List<Integer> sortedList = insertSort(numbers);

        assertThat(sortedList).isEqualTo(expected);
    }

    private List<Integer> insertSort(List<Integer> numbers) {

        final List<Integer> sortedList = new LinkedList<Integer>();

        originalList:
        for (Integer number : numbers) {
            for (int i = 0; i < sortedList.size(); i++) {
                if (number < sortedList.get(i)) {
                    sortedList.add(i, number);
                    continue originalList;
                }
            }
            sortedList.add(sortedList.size(), number);
        }
        return sortedList;
    }
}
