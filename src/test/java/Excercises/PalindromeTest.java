package Excercises;

import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeTest {

    @Test
    public void palindromeWithEvenLetters() {
        final String word = "levvel";

        boolean result = Palindrome.check(word);

        assertThat(result).isTrue();
    }

    @Test
    public void palindromeWithOddLetters() {
        final String word = "level";

        boolean result = Palindrome.check(word);

        assertThat(result).isTrue();
    }

    @Test
    public void palindromeWithSpace() {
        final String word = "Taco cat";

        boolean result = Palindrome.check(word);

        assertThat(result).isTrue();
    }

    @Test
    public void palindromeWithSpaceAndManyWords() {
        final String word = "Satan oscillate my metallic sonatas";

        boolean result = Palindrome.check(word);

        assertThat(result).isTrue();
    }

    @Test
    public void palindromeWithCharactersThatAreNoLetters() {
        final String word = "Madam, I'm Adam";

        boolean result = Palindrome.check(word);

        assertThat(result).isTrue();
    }

    @Test
    public void notAPalindrome() {
        final String word = "leasl";

        boolean result = Palindrome.check(word);

        assertThat(result).isFalse();
    }
}
