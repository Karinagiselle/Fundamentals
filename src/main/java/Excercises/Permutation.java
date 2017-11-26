package Excercises;

public class Permutation {
    public static int isAPermutation(int[] array) {
        int result = 1;

        if (array.length == 0) {
            result = 0;
        } else {
            for (int value = 1; value <= array.length; value++) {
                boolean isPermutation = false;
                for (int position = 0; position < array.length; position++) {
                    if (array[position] == value) {
                        isPermutation = true;
                        break;
                    }
                }
                if (!isPermutation) {
                    return 0;
                }
            }
        }
        return result;
    }
}
