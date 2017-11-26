package Excercises;

public class FrogJump {
    public static int calculateJump(int x, int y, int d) {

        if (x < 0 || y < 0 || d < 0 || x > y) {
            throw new IllegalArgumentException("Argument error");
        }

        if (d == 0) {
            return 0;
        }

        int position = x + d;
        int jumps = 0;
        while (position < y) {
            jumps++;
            position += d;
        }

        if(jumps == 0) {
            return 0;
        }
        return jumps + 1;
    }
}
