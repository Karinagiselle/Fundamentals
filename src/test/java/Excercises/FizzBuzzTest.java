package Excercises;

import org.apache.commons.lang3.StringUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void printAllNumberBetween1toN() {
        List<String> result = FizzBuzz.printNumbersFrom1To(10);

        assertThat(result).hasSize(10);
    }

    @Test
    public void printAllNumbersBetween1toNReplacingMultipleOf3WithFIZZ() {
        List<String> result = FizzBuzz.printNumbersFrom1To(10);

        int count = StringUtils.countMatches(result.toString(), "Fizz");

        assertThat(count).isEqualTo(3);
    }

    @Test
    public void printAllNumbersBetween1toNReplacingMultipleOf5WithBUZZ() {
        List<String> result = FizzBuzz.printNumbersFrom1To(10);

        int count = StringUtils.countMatches(result.toString(), "Buzz");

        assertThat(count).isEqualTo(2);
    }

    @Test
    public void printAllNumbersBetween1toNReplacingMultipleOf15WithFIZZBUZZ() {
        List<String> result = FizzBuzz.printNumbersFrom1To(30);

        int count = StringUtils.countMatches(result.toString(), "FizzBuzz");

        assertThat(count).isEqualTo(2);
    }
}
