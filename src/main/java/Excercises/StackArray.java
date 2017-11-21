package Excercises;

public class StackArray<E> {

    private E[] stack;
    private int counter;

    public StackArray(int max) {
        this.stack = (E[]) new Object[max];
        counter = 0;
    }

    public boolean isEmpty() {
        return counter == 0;
    }

    public void push(E value) {

        if (counter == stack.length) {
            throw new IllegalStateException("Full Stack");
        } else {
            stack[counter] = value;
            counter++;
        }
    }

    public E pop() {
        E value = stack[counter-1];
        stack[counter] = null;
        counter--;

        return value;
    }

}
