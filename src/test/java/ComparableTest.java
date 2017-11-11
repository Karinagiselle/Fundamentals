import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {

    @Test
    public void sortArrayOfPrimitives() {

        final int[] numbers = {-1, 5, 2, 6, 4};
        final int[] expected = {-1, 2, 4, 5, 6};

        Arrays.sort(numbers);

        assertThat(numbers).isEqualTo(expected);
    }

    /* String implements Comparable */
    @Test
    public void sortArrayOfObjectString() {

        final String[] strings = {"zqe", "zqa", "sdw", "aad"};
        final String[] expected = {"aad", "sdw", "zqa", "zqe"};

        Arrays.sort(strings);

        assertThat(strings).isEqualTo(expected);
    }
}
