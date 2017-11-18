package Excercises;

import java.util.LinkedList;
import java.util.List;

public class Stack {

    private List values;

    Stack() {
        values = new LinkedList();
    }

    public void push(int value) {
        values.add(0, value);
    }

    public Object pop() {
        if(values.size() == 0) {
            return null;
        }
        return values.remove(0);
    }
}
