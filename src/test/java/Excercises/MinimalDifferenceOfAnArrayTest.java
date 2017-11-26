package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimalDifferenceOfAnArrayTest {

    @Test
    public void emptyArray() {
        final int[] emptyArray = {};
        final int expectedResult = 0;

        assertThat(MinimalDifferenceOfAnArray.getMinimalDifference(emptyArray)).isEqualTo(expectedResult);
    }

    @Test
    public void twoElementArray() {
        final int[] emptyArray = {1, 2};
        final int expectedResult = 1;

        assertThat(MinimalDifferenceOfAnArray.getMinimalDifference(emptyArray)).isEqualTo(expectedResult);
    }

    @Test
    public void fiveElementArray() {
        final int[] emptyArray = {3, 1, 2, 4, 3};
        final int expectedResult = 1;

        assertThat(MinimalDifferenceOfAnArray.getMinimalDifference(emptyArray)).isEqualTo(expectedResult);
    }
}
