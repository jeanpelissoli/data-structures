# Data Structures & Algorithms
Implementing and analyzing Big O notation and the usages of data structures and algorithms.

## Linked List:
- **append**: O(1);
- **removeLast**: O(n);
- **prepend**: O(1);
- **removeFirst**: O(1);
- **insert**: O(n);
- **remove**: O(n);
- **lookUps**: O(n);

## Stack

The **Call Stack** is a data structure used by the **operating system and the JVM** to manage the execution of functions/methods in a program.

- Stores **local variables, function parameters, and return addresses**.  
- Each time a function is called, a new **stack frame** is **pushed onto the Call Stack**.  
- When the function completes, this **frame is automatically removed** from the stack.  
- **Fixed size**, defined by the JVM → Can cause **Stack Overflow** if exceeded. 
