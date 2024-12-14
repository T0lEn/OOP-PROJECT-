package Lab3.task3;
import java.util.*;

public class MyList<T> implements MyCollection<T> {
    private List<T> myList;
    public MyList() {
        myList = new ArrayList<>();
    }

    @Override
    public boolean add(T t) {
        return myList.add(t);
    }
    @Override
    public boolean remove(T t) {
        return myList.remove(t);
    }
    @Override
    public boolean contains(T t) {
        return myList.contains(t);
    }
    @Override
    public int size() {
        return myList.size();
    }
    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }
    public List<T> getElements() {
        return new ArrayList<>(myList);
    }


}
