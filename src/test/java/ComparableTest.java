import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.Arrays;

public class ComparableTest {

    @Test
    public void sortArrayOfPrimitives() {

        final int[] numbers = {-1, 5, 2, 6, 4};
        final int[] expected = {-1, 2, 4, 5, 6};

        Arrays.sort(numbers);

        Assertions.assertThat(expected).isEqualTo(numbers);
    }
}
