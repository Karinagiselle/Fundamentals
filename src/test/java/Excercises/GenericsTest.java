package Excercises;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenericsTest {

    @Test
    public void add1ToAListOfNumbers() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> listOfNumbersExpeted = Arrays.asList(2, 3, 4, 5);

        List<Integer> result = Generics.updateList(listOfNumbers, new AddOneOperation());

        assertThat(result).isEqualTo(listOfNumbersExpeted);
    }

    @Test
    public void stringLengthOperation() {

        List<String> listOfWords = Arrays.asList("word", "asdqww", "asdaqff");
        List<Integer> listExpected = Arrays.asList(4, 6, 7);

        List<Integer> result = Generics.updateList(listOfWords, new StringLengthOperationGenerics());

        assertThat(result).isEqualTo(listExpected);
    }

    @Test
    public void add1ToAListOfNumbersUsingGenerics() {
        final List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4);
        final List<Integer> listOfNumbersExpeted = Arrays.asList(2, 3, 4, 5);

        List<Integer> result = Generics.updateList(listOfNumbers, new AddOneOperationGeneric());

        assertThat(result).isEqualTo(listOfNumbersExpeted);
    }

    @Test
    public void pushAndPopStack() {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);

        assertThat(stack.pop()).isEqualTo(2);
        assertThat(stack.pop()).isEqualTo(1);
    }

    @Test
    public void genericStack() {
        GenericStack genericStack = new GenericStack();

        genericStack.push("Hello");
        genericStack.push(1L);
        genericStack.push(2);

        assertThat(genericStack.pop()).isEqualTo(2);
        assertThat(genericStack.pop()).isEqualTo(1L);
        assertThat(genericStack.pop()).isEqualTo("Hello");
    }

    @Test
    public void pushAllA() {
        GenericStack genericStack = new GenericStack();
        List<A> listA = new ArrayList<A>();
        listA.add(new A());

        GenericStack<A> stack = genericStack.pushAllA(listA);

        assertThat(stack).isNotNull();
    }

    @Test
    public void pushAllB() {
        GenericStack genericStack = new GenericStack();
        List<B> listB = new ArrayList<B>();
        listB.add(new B());

        GenericStack<A> stack = genericStack.pushAllA(listB);

        assertThat(stack).isNotNull();
    }
}
