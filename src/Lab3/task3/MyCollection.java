package Lab3.task3;

public interface MyCollection<T>{
    boolean add(T element);
    boolean remove(T element);
    boolean contains(T element);
    int size();
    boolean isEmpty();
}
