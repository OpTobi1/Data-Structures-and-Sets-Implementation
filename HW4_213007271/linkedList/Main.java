// Assignment: 4
// Author: Liav Lugasi, ID: 213007271

package HW4_213007271.linkedList;

/**
 * Main class to demonstrate the DoublyLinkedList functionality.
 */
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();

        //creating linked list
        System.out.println("DoublyLinkedList: ");
        list.addLast("A");
        list.addLast("B");
        list.addFirst("C");
        System.out.println("List after adds: ");
        list.print();

        //is palindrome?
        System.out.println("Is palindrome? " + list.isPalindrome());
        list.addLast("A");
        list.addLast("C");
        System.out.print("List now: ");
        list.print();
        System.out.println("Is palindrome now? " + list.isPalindrome());

        //reverse
        System.out.println("Reversing the list: ");
        list.reverse();
        System.out.print("Reversed list: ");
        list.print();

        //delete A
        System.out.println("Removing all 'A'");
        list.remove("A");
        list.print();

        //size
        System.out.println("Size: " + list.size());
    }
}