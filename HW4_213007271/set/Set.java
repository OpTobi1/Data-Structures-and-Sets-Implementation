// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.set;

/**
 * A generic interface for a Set data structure.
 * @param <E> The type of elements in the set.
 */
public interface Set<E> {
    void add(E e);
    boolean remove(E e);
    boolean contains(E e);
    int size();
    boolean isEmpty();
}
