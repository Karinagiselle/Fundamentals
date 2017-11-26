package Excercises;

public class MinimalDifferenceOfAnArray {
    public static int getMinimalDifference(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int difference;
        int result = -1;
        for (int i = 0; i < array.length - 1; i++) {

            difference = difference(array, i + 1);
            if (difference < result || result == -1) {
                result = difference;
            }
        }

        return result;
    }

    private static int difference(int[] array, int i) {
        int leftSum = 0;
        int rightSum = 0;
        for (int j = 0; j < array.length; j++) {
            if (j < i) {
                leftSum += array[j];
            } else {
                rightSum += array[j];
            }
        }

        return Math.abs(leftSum - rightSum);
    }
}
