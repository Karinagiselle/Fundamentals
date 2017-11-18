package Excercises;

import java.util.LinkedList;
import java.util.List;

public class GenericStack<E> {

    private List<E> values;

    GenericStack() {
        values = new LinkedList<E>();
    }

    public void push(E value) {
        values.add(0, value);
    }

    public E pop() {
        if (values.size() == 0) {
            return null;
        }

        return values.remove(0);
    }

    public GenericStack<A> pushAllA(List<? extends A> listA) {
        GenericStack<A> stack = new GenericStack<A>();

        for (A list : listA) {
            stack.push(list);
        }

        return stack;
    }
}
