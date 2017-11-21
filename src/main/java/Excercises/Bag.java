package Excercises;

import java.util.List;

public class Bag<T> {

    private List<T> bag;

    public Bag(List<T> bag) {
        this.bag = bag;
    }

    public int getSize() {
        return bag.size();
    }
}
