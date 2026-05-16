// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.linkedList;

/**
 * * A generic implementation of a Doubly Linked List.
 * This class implements the MyList interface using head and tail pointers.
 * * @param <T> The type of elements held in this list.
 */
public class DoublyLinkedList<T> implements MyList<T>{
    private Node<T> head;
    private Node<T> tail;

    /**
     * Default constructor initializing an empty list.
     */
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds an element to the beginning of the list. Complexity: O(1).
     * @param data The data to add.
     */
    @Override
    public void addFirst(T data){
        Node<T> newN = new Node<>(data);
        if(isEmpty()){
            head = tail = newN;
        }
        else {
            newN.next = head;
            head.prev = newN;
            head = newN;
        }
    }

    /**
     * Adds an element to the end of the list. Complexity: O(1).
     * @param data The data to add.
     */
    @Override
    public void addLast(T data){
        Node<T> newN = new Node<>(data);
        if(isEmpty()){
            head = tail = newN;
        }
        else {
            newN.prev = tail;
            tail.next = newN;
            tail = newN;
        }
    }

    /**
     * Removes all occurrences of the specified element. Complexity: O(n).
     * @param data The data to remove.
     * @return true if at least one element was removed, false otherwise.
     */
    @Override
    public boolean remove(T data){
        boolean r = false;
        Node<T> curr = head;
        while(curr != null){
            if(curr.data.equals(data)){
                r = true;
                if (curr == head && curr == tail) {
                    head = tail = null;
                } else if (curr == head) {
                    head = head.next;
                    head.prev = null;
                } else if (curr == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                }
            }
            curr = curr.next;
        }
        return r;
    }

    /**
     * Checks if the list contains the specified element. Complexity: O(n).
     * @param data The data to search for.
     * @return true if found, false otherwise.
     */
    @Override
    public boolean contains(T data) {
        Node<T> curr = head;
        while (curr != null) {
            if (curr.data.equals(data)) return true;
            curr = curr.next;
        }
        return false;
    }

    /**
     * Checks if the list is empty. Complexity: O(1).
     * @return true if empty, false otherwise.
     */
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Calculates the number of elements in the list. Complexity: O(n).
     * @return The size of the list.
     */
    @Override
    public int size(){
        int count = 0;
        Node<T> curr = head;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        return count;
    }

    /**
     * Checks if the list is a palindrome.
     * Compares elements from both ends moving towards the middle.
     * @return true if palindrome, false otherwise.
     */
    @Override
    public boolean isPalindrome() {
        if (head == null || head == tail) {
            return true;
        }
        Node<T> left = head;
        Node<T> right = tail;
        while (left != null && right != null && left != right && left.prev != right) {
            if (!left.data.equals(right.data)) {
                return false;
            }
            left = left.next;
            right = right.prev;
        }
        return true;
    }

    /**
     * Reverses the list in-place by swapping next and prev pointers of each node.
     */
    @Override
    public void reverse(){
        if (isEmpty()) return;
        Node<T> curr = head;
        Node<T> temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev; // Move to original next node
        }
        temp = head;
        head = tail;
        tail = temp;
    }

    /**
     * Prints the list elements in the format: data1 <- data2 <- ...
     */
    @Override
    public void print() {
        Node<T> curr = head;
        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) System.out.print(" <- ");
            curr = curr.next;
        }
        System.out.println();
    }
}
