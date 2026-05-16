// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.set;

/**
 * A generic implementation of a Set using an array.
 * @param <E> The type of elements in the set.
 */
public class SimpleSet<E> implements Set<E>{
    private E[] elements;
    private int size;
    private int capacity;

    /**
     * Constructor with initial capacity.
     * @param capacity The starting capacity of the set.
     */
    @SuppressWarnings("unchecked")
    public SimpleSet(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.elements = (E[]) new Object[capacity];
    }

    /**
     * Default constructor with capacity 5.
     */
    public SimpleSet() {
        this(5);
    }

    /**
     * Adds an element if it's not already present.
     * Increases capacity if full.
     * @param e The element to add.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void add(E e) {
        if (contains(e)) return;
        if (size >= capacity) {
            capacity += 5;
            E[] newElements = (E[]) new Object[capacity];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = e;
    }

    /**
     * Removes an element and maintains array continuity.
     * @param e The element to remove.
     * @return true if removed, false otherwise.
     */
    @Override
    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) {
                for (int j = i; j < size - 1; j++) {
                    elements[j] = elements[j + 1];
                }
                elements[--size] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Checks if this set contains the specified element.
     * * @param e The element whose presence in this set is to be tested.
     * @return true if this set contains the specified element, false otherwise.
     */
    @Override
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(e)) return true;
        }
        return false;
    }

    /**
     * Returns the number of elements in this set.
     * * @return The number of elements in this set (its cardinality).
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Returns true if this set contains no elements.
     * * @return true if this set is empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Utility method to get element at index (for internal use by SetUtils).
     */
    protected E get(int index) {
        if (index < 0 || index >= size) return null;
        return elements[index];
    }
}
