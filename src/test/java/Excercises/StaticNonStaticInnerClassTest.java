package Excercises;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StaticNonStaticInnerClassTest {

    @Test
    public void test() {
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner innerClass = outerClass.new Inner(44);

        OuterClass.StaticInnerClass staticClass = new OuterClass.StaticInnerClass(10);

        assertThat(staticClass.getbField()).isEqualTo(10);
        assertThat(innerClass.getaField()).isEqualTo(44);

    }
}
