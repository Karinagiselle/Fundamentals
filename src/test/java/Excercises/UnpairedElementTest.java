package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UnpairedElementTest {

    @Test
    public void sevenIsTheUnpairedElement() {
        final int[] array = {9, 3, 9, 3, 9, 7, 9};
        final int expectedResult = 7;

        assertThat(UnpairedElement.getUnpairedElement(array)).isEqualTo(expectedResult);
    }

    @Test
    public void unpairedTheFirstElement() {
        final int[] array = {3, 0, 2, 0, 2};
        final int expectedResult = 3;

        assertThat(UnpairedElement.getUnpairedElement(array)).isEqualTo(expectedResult);
    }

    @Test
    public void unpairedTheLastElement() {
        final int[] array = {0, 2, 0, 2, 3};
        final int expectedResult = 3;

        assertThat(UnpairedElement.getUnpairedElement(array)).isEqualTo(expectedResult);
    }

    @Test
    public void arrayWithSameNumbers() {
        final int[] array = {9, 9, 9, 9, 9};
        final int expectedResult = 9;

        assertThat(UnpairedElement.getUnpairedElement(array)).isEqualTo(expectedResult);
    }


}
