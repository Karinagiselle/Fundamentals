package Excercises;

public class ArrayInteger {

    public static int getSmallestPositeveIntNotOcurr(int[] array) {
        int candidate = 1;

        while (findCandidate(array, candidate)) {
            candidate++;
        }

        return candidate;
    }

    private static boolean findCandidate(int[] arrray, int candidate) {
        for (int i = 0; i < arrray.length; i++) {
            if (arrray[i] == candidate) {
                return true;
            }
        }
        return false;
    }
}
