package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJumpTest {

    @Test(expected = IllegalArgumentException.class)
    public void invalidInputs() {
        final int x = -1;
        final int y = -1;
        final int d = -1;

        FrogJump.calculateJump(x,y,d);
    }

    @Test
    public void threeJumps() {
        final int x = 10;
        final int y = 85;
        final int d = 30;
        final int jumps = 3;

        assertThat(FrogJump.calculateJump(x,y,d)).isEqualTo(jumps);
    }

    @Test
    public void oneJump() {
        final int x = 10;
        final int y = 11;
        final int d = 1;
        final int jumps = 1;

        assertThat(FrogJump.calculateJump(x,y,d)).isEqualTo(jumps);
    }

    @Test
    public void noJumpForDistanceEqualCero() {
        final int x = 10;
        final int y = 11;
        final int d = 0;
        final int jumps = 0;

        assertThat(FrogJump.calculateJump(x,y,d)).isEqualTo(jumps);
    }

    @Test
    public void noJumpNeeded() {
        final int x = 1;
        final int y = 1;
        final int d = 3;
        final int jumps = 0;

        assertThat(FrogJump.calculateJump(x,y,d)).isEqualTo(jumps);
    }
}
