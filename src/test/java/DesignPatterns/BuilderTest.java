package DesignPatterns;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderTest {

    @Test
    public void buildStudent() {
        final String name = "Karina";
        final String surname = "Blanco";
        final String doc = "123";

        final Student student = new Student.Builder()
                                            .withName(name)
                                            .withSurname(surname)
                                            .withDoc(doc)
                                            .build();

        assertThat(student.getName()).isEqualTo(name);
        assertThat(student.getSurname()).isEqualTo(surname);
        assertThat(student.getDoc()).isEqualTo(doc);
    }

    @Test(expected = IllegalStateException.class)
    public void cannotBuildStudent() {
        final String name = "Karina";
        final String surname = "Blanco";

        final Student student = new Student.Builder()
                .withName(name)
                .withSurname(surname)
                .build();
    }
}
