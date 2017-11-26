package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RotateArrayTest {


    @Test
    public void emptyArray() {
        final int[] array = {};
        final int[] expectedArray = {};
        final int times = 1;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }

    @Test
    public void noRotation() {
        final int[] array = {3, 8, 9, 7, 6};
        final int[] expectedArray = {3, 8, 9, 7, 6};
        final int times = 0;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }

    @Test
    public void OneRotation() {
        final int[] array = {3, 8, 9, 7, 6};
        final int[] expectedArray = {6, 3, 8, 9, 7};
        final int times = 1;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }

    @Test
    public void OneRotationWithSameValues() {
        final int[] array = {0, 0, 0};
        final int[] expectedArray = {0, 0, 0};
        final int times = 1;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }

    @Test
    public void ThreeRotation() {
        final int[] array = {3, 8, 9, 7, 6};
        final int[] expectedArray = {9, 7, 6, 3, 8};
        final int times = 3;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }

    @Test
    public void FourRotation() {
        final int[] array = {1, 2, 3, 4};
        final int[] expectedArray = {1, 2, 3, 4};
        final int times = 4;

        assertThat(RotateArray.rotate(array, times)).isEqualTo(expectedArray);
    }
}
