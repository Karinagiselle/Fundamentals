package Excercises;

import java.util.LinkedList;
import java.util.List;

public class RotateArray {
    public static int[] rotate(int[] array, int times) {

        if (array.length == 0) {
            return array;
        }
        List<Integer> integerList = initialize(array);

        for (int rotation = 0; rotation < times; rotation++) {
            Integer aux = integerList.get(integerList.size() - 1);
            integerList.remove(integerList.size() - 1);
            integerList.add(0, aux);
        }

        return convertToArray(integerList);
    }

    private static int[] convertToArray(List<Integer> integerList) {
        int[] result = new int[integerList.size()];
        for (int position = 0; position < integerList.size(); position++) {
            result[position] = integerList.get(position);
        }
        return result;
    }

    private static List<Integer> initialize(int[] array) {
        List<Integer> result = new LinkedList<Integer>();

        for (int i = 0; i < array.length; i++) {
            result.add(i, array[i]);
        }

        return result;
    }
}
