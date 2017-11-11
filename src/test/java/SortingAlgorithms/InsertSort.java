package SortingAlgorithms;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/*
* A linked list is very ef cient in adding elements in the middle of the list,
* simply by rearranging the pointers of the nodes in the list.
* The worst-case performance for this algorithm is still O(n2).
* The algorithm described here uses twice as much space to sort the list because a new list is returned.
* The bubble sort algorithm only uses one extra slot in memory, to hold the value temporarily while being swapped.
*/
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

        originalList : for (Integer number : numbers) {
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
