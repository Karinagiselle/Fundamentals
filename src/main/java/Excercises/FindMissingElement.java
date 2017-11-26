package Excercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {
    public static int findMissingElement(int[] array) {
        if (array.length == 0) {
            return 1;
        }

        List<Integer> list = convertToList(array);

        return findElement(list);
    }

    private static int findElement(List<Integer> list) {
        int result = list.size() + 1;
        for (int position = 0; position < list.size(); position++) {
            if (!list.get(position).equals(position + 1)) {
                result = position + 1;
                break;
            }
        }
        return result;
    }

    private static List<Integer> convertToList(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int position = 0; position < array.length; position++) {
            list.add(position, array[position]);
        }
        Collections.sort(list);
        return list;
    }
}
