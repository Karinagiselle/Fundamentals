package Excercises;

public class UnpairedElement {


    public static int getUnpairedElement(int[] array) {

        int[] arrayCopy = array.clone();
        int position = arrayCopy.length - 1;

        for (int i = 0; i < arrayCopy.length; i++) {

            for (int j = i + 1; j < arrayCopy.length; j++) {
                if (arrayCopy[i] == -1) {
                    break;
                }
                if (arrayCopy[i] == arrayCopy[j] && arrayCopy[j] != -1) {
                    arrayCopy[i] = -1;
                    arrayCopy[j] = -1;
                    break;
                }
                if (j == arrayCopy.length - 1) {
                    position = i;
                }
            }
        }
        return arrayCopy[position];
    }
}
