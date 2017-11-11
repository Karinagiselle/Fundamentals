import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    private static class ClassWithNoComparableInterface {

        private int i;

        private ClassWithNoComparableInterface(int i) {
            this.i = i;
        }
    }

    @Test(expected = ClassCastException.class)
    public void sortArrayOfObjectWithoutComparableInterface() {

        final List<ClassWithNoComparableInterface> objects = new ArrayList();

        for (int i = 0; i < 5; i++) {
            objects.add(new ClassWithNoComparableInterface(i));
        }

        Arrays.sort(objects.toArray());
    }
}
