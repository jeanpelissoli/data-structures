# Data Structures & Algorithms
Implementing and analyzing Big O notation and the usages of data structures and algorithms.

## Stack

The **Call Stack** is a data structure that follows the LIFO (Last in, First out) used by the **operating system and the JVM** to manage the execution of functions/methods in a program.

- Stores **local variables, function parameters, and return addresses**;
- Each time a function is called, a new **stack frame** is **pushed onto the Call Stack**;
- When the function completes, this **frame is automatically removed** from the stack;
- **Fixed size**, defined by the JVM → Can cause **Stack Overflow** if exceeded;

## Queue

A Queue is a linear data structure that follows the FIFO (First in, First out) principle. This means that elements are added at the rear and removed from the front, just like a real-world queue (e.g., a line at a store).
<br><br>




## Linked List
- **append**: O(1);
- **removeLast**: O(n);
- **prepend**: O(1);
- **removeFirst**: O(1);
- **insert**: O(n);
- **remove**: O(n);
- **lookUps**: O(n);

## Binary Search Tree
- The total number of nodes in a balanced binary tree is approximately **2^h - 1**, where **h** is the tree height.
- Removing 1 gives us **2^h**, which simplifies to **O(2^h)**.
- However, since we are effectively halving the problem at each step (Divide and Conquer), the height of a balanced tree is **O(log n)**, leading to **O(log n)** complexity for many operations.
- If the tree degenerates into a linked list (i.e., every node has only one child), the worst-case complexity becomes **O(n)**.
- Therefore, the real Big O complexity depends on tree balance:
  - **Balanced Tree:** **O(log n)**
  - **Degenerate (Linked List-like) Tree:** **O(n)**

## HashTable
The HashTable is a data structure that efficiently maps keys to values, using a hash function to distribute the data within an array. I have implemented collision handling using the linked list method (separate chaining).
- Without collisions or few collisions: O(1) for all operations;
- With a lot of collisions: O(n);

## Graph
Bidirection graph using adjacency list.
- **addVertex**: O(1);
- **addEdge**: O(1);
- **removeEdge**: O(E);
- **removeVertex**: O(V + E);

## Heap
Ideal when implementing a priority queue, fast access to max value or min value. Non related to the area of memory that is also called heap and allocate objects.
O(log n) for all op.

## BubbleSort
O(n^2);
