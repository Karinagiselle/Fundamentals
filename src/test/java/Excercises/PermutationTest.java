package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermutationTest {

    @Test
    public void emptyArray() {
        int[] array = {};

        assertThat(Permutation.isAPermutation(array)).isEqualTo(0);
    }

    @Test
    public void isAPermutation() {
        final int[] array = {1, 4, 3, 2};

        assertThat(Permutation.isAPermutation(array)).isEqualTo(1);
    }

    @Test
    public void isAPermutationWithTwoElement() {
        final int[] array = {1, 2};

        assertThat(Permutation.isAPermutation(array)).isEqualTo(1);
    }

    @Test
    public void isNotAPermutation() {
        final int[] array = {1, 4, 2};

        assertThat(Permutation.isAPermutation(array)).isEqualTo(0);
    }
}
