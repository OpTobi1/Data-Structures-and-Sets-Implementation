// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.linkedList;

public interface MyList<T> {

    void addFirst(T data);
    void addLast(T data);

    boolean remove(T data);
    boolean contains(T data);

    boolean isEmpty();
    int size();

    boolean isPalindrome();
    void reverse();

    void print();
}