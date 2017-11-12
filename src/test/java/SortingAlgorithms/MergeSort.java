package SortingAlgorithms;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
*  Merge sort has a performance of O(n log n).
*  Each merge operation is O(n), and each recur- sive call works on only half of the given list.
* */
public class MergeSort {

    @Test
    public void insertSortTest() {

        final List<Integer> numbers = Arrays.asList(5, 2, 6, 1, 3, 8, 9, 4);
        final List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 8, 9);

        List<Integer> sortedList = mergeSort(numbers);

        assertThat(sortedList).isEqualTo(expected);
    }

    private List<Integer> mergeSort(List<Integer> numbers) {

        if (numbers.size() < 2) {
            return numbers;
        }

        List<Integer> left = numbers.subList(0, numbers.size() / 2);
        List<Integer> right = numbers.subList(numbers.size() / 2, numbers.size());

        return merge(mergeSort(left), mergeSort(right));
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {

        List<Integer> merged = new ArrayList<Integer>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (left.get(leftIndex) < right.get(rightIndex)) {
                merged.add(left.get(leftIndex));
                leftIndex++;
            } else {
                merged.add(right.get(rightIndex));
                rightIndex++;
            }
        }

        while (leftIndex < left.size()) {
            merged.add(left.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < right.size()) {
            merged.add(right.get(rightIndex));
            rightIndex++;
        }
        return merged;
    }
}
