package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindMissingElementTest {

    @Test
    public void emptyArray() {
        final int[] array = {};
        final int result = 1;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void findMissingElementInAnArrayOf4() {
        final int[] array = {2,3,1,5};
        final int result = 4;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void findMissingElementInAnArrayOf6() {
        final int[] array = {7,6,5,4,3,2};
        final int result = 1;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void singleElement() {
        final int[] array = {2};
        final int result = 1;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void lastElement() {
        final int[] array = {2,3,1};
        final int result = 4;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void firstElement() {
        final int[] array = {3,2,4};
        final int result = 1;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }

    @Test
    public void twoElements() {
        final int[] array = {3,1};
        final int result = 2;

        assertThat(FindMissingElement.findMissingElement(array)).isEqualTo(result);
    }
}
