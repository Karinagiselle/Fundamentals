package DesignPatterns.Creational;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonTest {

    @Test
    public void singleton() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        assertThat(singleton1).isSameAs(singleton2);
    }
}
