// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.linkedList;

public class Node<T> {

    T data;
    Node<T> next;
    Node<T> prev;

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}