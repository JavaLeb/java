package design_pattern.iterator;

/**
 * Created by leboop on 2020/5/24.
 */
public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
