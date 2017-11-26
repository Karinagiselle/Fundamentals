package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BinaryGapTest {

    @Test
    public void smallNumber() {
        final int gapExpected = 2;
        final int number = 9;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }

    @Test
    public void largeNumber() {
        final int gapExpected = 4;
        final int number = 529;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }

    @Test
    public void binaryGapLength1() {
        final int gapExpected = 1;
        final int number = 20;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }

    @Test
    public void noBinaryGap() {
        final int gapExpected = 0;
        final int number = 15;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }

    @Test
    public void noBinaryGap3() {
        final int gapExpected = 0;
        final int number = 3;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }

    @Test
    public void binaryGap5() {
        final int gapExpected = 5;
        final int number = 1041;

        assertThat(BinaryGap.longestBinaryGap(number)).isEqualTo(gapExpected);
    }
}
