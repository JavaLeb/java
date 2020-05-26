package design_pattern.iterator;

/**
 * Created by leboop on 2020/5/24.
 */
public interface MyCollection<T> extends MyIterable<T>{
    int size();

    boolean add(T e);

    T get(int index);

    MyIterator<T> myIterator();
}
