# Good Code
- Readability
- Scalable Code 
    - Speed - Big O is defined by this (time complexity)
    - Memory(Space complexity)

Big O notation is the language we use to measure how the algorithm takes to runs
- i.e when we grow with data how is the performace of your algorithm

- calculating big O
    - consider the Worst case
    - Remove constants
    - Differents terms of input
    - Drop non dominants

- O(1),O(log n) - excellent,good big O
- O(n) - fair big O
- O(n log n) - bad Big O
- O(n^2) - horrible big O
- O(2^n) - horrible big O
- O(n!) - horrible big O

- [Big O cheatsheet](./BigO-cheat-sheet.pdf)
- [https://www.bigocheatsheet.com/](https://www.bigocheatsheet.com/)


## Data Structures

- Collection of values -
    - these values can have relation b/w them 
    - have function executed on them
    - [Data-structures list](https://en.wikipedia.org/wiki/List_of_data_structures)

### Arrays

-  In arrays Lookup  - O(1), Push O(1), Inserts O(n), Deletion O(n)
- Static Array and Dynamic Arrays
    - Static array - fixed array size
    - Dynamic Array - Resizable array
- Arrays are good for 
    - faster look ups - o(1) access if index is known
    - fast push and pop 
    - ordered
- Cons of array
    - Slow inserts - o(n)
    - Slow deletes - o(n)
    - Fixed size

### Hash Tables
- search , inserts and delete are O(n) in hash tables , worst case senario in case of clash of hash will lead to O(n) 
- Pros: 
    - Fast look ups 
    - fast inserts
    - flexible keys
- cons:
   - unordered
   - slower key iterations

### Linked List

- prepend and append - O(1)
- lookup , insert and delete - O(n)

- Pros
    - O(1) prepend and append
    - O(1) on pop

### Stacks and Queues

- Stacks - LIFO - last in first out
- Stacks have only following func - push,pop,peek,lookup

- Queues - FIFO - First in first out
- enqueue, dequeue, peek, lookup

### Trees

- Balanced Trees 
    - no of nodes = height of balanced tree *2 -1
    - look up , insert and delete complexity of balanced tree= O(log n)
    - log n = height of tree
- Unbalanced Trees

- Binary search tree - the no greater than root node are placed right side and lesser on left side

- pros and cons 
    - Better than O(n)
    - Ordered
    - Flexible size

    - cons - no O(1) operations 