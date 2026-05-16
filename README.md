# Data Structures and Sets Implementation - Java

This repository contains the implementation of two fundamental computer science assignments focused on Object-Oriented Programming (OOP) principles, Generics, and Linked Data Structures.

## Project Structure

The project is divided into two main packages:
1. `linkedList`: A custom implementation of a Doubly Linked List.
2. `set`: A generic Set implementation using dynamic arrays and a utility class for set operations.

---

## Part 1: Doubly Linked List

A generic implementation of a Doubly Linked List where each node has a reference to both the next and the previous node.

### Key Features:
- **Efficient Operations:** `addFirst` and `addLast` are performed in $O(1)$ time complexity using `head` and `tail` pointers.
- **In-Place Reverse:** A method to reverse the entire list without using extra memory.
- **Palindrome Check:** An algorithm that uses the dual-pointer nature of the list to check for symmetry in $O(n)$ time.
- **Dynamic Size:** Methods to track size, check for emptiness, and remove specific elements.

### Core Methods:
- `addFirst(T data)` / `addLast(T data)`
- `remove(T data)` - Removes all occurrences of a value.
- `isPalindrome()` - Returns true if the list is a palindrome.
- `reverse()` - Reverses the list in-place.

---

## Part 2: Generic SimpleSet

A custom implementation of a Mathematical Set that stores unique elements using a dynamic array.

### Key Features:
- **Automatic Resizing:** The internal array grows by 5 elements whenever the capacity is reached.
- **Uniqueness:** Ensures no duplicate elements are stored (based on the `equals` method).
- **Set Operations:** A utility class (`SetUtils`) providing standard mathematical operations.

### Set Mathematics (SetUtils):
- **Union:** Combines two sets.
- **Intersection:** Finds common elements.
- **Difference:** Elements in Set A that are not in Set B.
- **Symmetric Difference:** Elements in either set, but not in both.
- **Power Set:** Generates all possible subsets of a given set.
