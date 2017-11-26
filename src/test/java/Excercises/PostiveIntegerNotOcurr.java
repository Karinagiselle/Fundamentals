package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PostiveIntegerNotOcurr {

    @Test
    public void manyItemsInArray() {
        int[] arrayOfInt = {1, 3, 6, 4, 1, 2};
        int expectedResult = 5;

        assertThat(ArrayInteger.getSmallestPositeveIntNotOcurr(arrayOfInt)).isEqualTo(expectedResult);
    }

    @Test
    public void fewItemsInArray() {
        int[] arrayOfInt = {1, 2, 3};
        int expectedResult = 4;

        assertThat(ArrayInteger.getSmallestPositeveIntNotOcurr(arrayOfInt)).isEqualTo(expectedResult);
    }

    @Test
    public void negativeItemsInArray() {
        int[] arrayOfInt = {-1, -3};
        int expectedResult = 1;

        assertThat(ArrayInteger.getSmallestPositeveIntNotOcurr(arrayOfInt)).isEqualTo(expectedResult);
    }
}
