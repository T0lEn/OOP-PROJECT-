package Lab3.task3;

import java.util.*;

public class MySet<T> implements MyCollection<T>{
    private Set<T> set;
    public MySet() {
        set = new HashSet<>();
    }


    @Override
    public boolean add(T element) {
        return set.add(element);
    }
    @Override
    public boolean remove(T element) {
        return set.remove(element);
    }
    @Override
    public boolean contains(T element) {
        return set.contains(element);
    }
    @Override
    public int size() {
        return set.size();
    }
    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    public Set<T> getElements() {
        return new HashSet<>(set);
    }
}
