package Excercises;

public class BinaryGap {


    public static int longestBinaryGap(int number) {

        String binary = Integer.toBinaryString(number);
        int result = 0;
        int counter = 0;
        boolean gap = false;

        for (int i = 0; i < binary.length(); i++) {
            if (gap) {
                counter++;
            }

            if (binary.charAt(i) == '1' && counter == 0) {
                gap = true;
            }

            if (binary.charAt(i) == '1' && counter != 0) {
                if (counter > result) {
                    result = counter - 1;
                }
                counter = 0;
            }
        }
        return result;
    }
}
