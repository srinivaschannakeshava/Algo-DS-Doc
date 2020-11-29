# Algorithms and DataStructures

## 

### Node
- Basic building block
    - provides mechanism to contain piece of data.
    - A means to connect to another node. ex - next pointer
 > Note: Node chains are nodes linked to next node. 

 ### Linked List
 - Single chain of nodes
    - it has head pointer
    - tail pointer
    - operations
        - add , remove, find , enumerate 
    > Note : Linked list have efficient *add* operation as the add involves same process of updating a pointer unlike shifting of data like in arrays.
    > Linked list remove from last operation is very costly as the size of list increase as each node need to be traveresed- so always prefer remove from head.  
### Doubly Linked list
- double chain of nodes
    - each node has link to previous and next node
        this reduces the cost of remove opperation found in singly linked list
### Stacks
- Stacks follow LIFO(last in first out)
- adding an object to stack is termed as *push*
- removing is termed as *pop*
> some of applications of Stacks  
> - Postfix Algorithm using stack  
> - Undo operations

### Queues
- Queue is a collection that returns item in same order they where added.
- Queue follows FIFO(first in first out)
- adding an object to queue is termed as *Enqueue*
- removing is termed as *Dequeue*
 ```
Note:- Arrays based implementation are preferred in both Queues and stacks 
as they are more efficient w.r.t memory and performance.
A general thumb rule on linked list is that there is an overhead of memory allocation for each node and memory used by value is more than that used by node .
Arrays have datalocality and performance w.r.t enqueue and dequeue
 ``` 
> Priority Queue - 
> - They are not FIFO but depends on the priority of the item added to the queue

### Binary trees
- In linked lists the nodes are linked linearly and traverse is either oneside if singly linked list and two side if doubly linked list, where as in Tree the nodes are linked to one another hierarchical
- Each node has a single path connecting to other nodes.
- *Binary Tree* 
    - Hierarchy of data
    - A root node and 0-2 children for each node
    - Left child and Right child
    - Each child itself is a tree with a left child and right child
- *Binary Search Tree*
    - Sorted Heirachy of data
    - A Root Child
    - left child - size is less that parent
    - right child - greated than parent
- Adding data to Binary tree
    - Adding data to binary tree uses recursive Algorithm
    - Case -1 : Empty Tree 
        - the data becomes root node
    - case -2 : smaller value
        - recursively added to left
    - case -3 : greater value
        - recursively added to right
    - case -4 : equal value
        - treated as greater and case3 is executed
- Remove data from binary tree
    - 
- Tree Traversal
    - Pre order traversal - process node-> visit left node -> visit right node
    - In-order Traversal - visit left-> process node -> visit right 
        - returns tree in sort order
    - Post order Traversal - visit left-> visit right -> process node

### Hash Table 
- Asssociative array
    - Storage of key/value pairs
 - Each key is unique
 - *Hashing*
    - Hashing derives a fixed size result from an input
    - An Hashing should have following characterstics
        - Stable- same input generates the same output every time
        - Uniform - hash value must be uniformly distributes through available space
        - Efficient - The cost of generating hash must be balance with app needs
        - Secure - the cost of finding data that procuces a given hash is prohibitive
> Hashing Alg ex:- Additive, Folding, CRC32, MD5, SHA-2   


# Algorithms and DataStructures -2

### Sorting algorithms

### Bubble-Sort
    - Simplest algorithm
    - Each element is compared to its neigbour element and swapped if greater than the its neigbour.
    - Repeat the same for remaining elements until there is no swap left .
    - Performance of bubble sort 
        - worst performance of bs of n elements is n^2(n square times of swap/comparisons)
        - not an appropriate for large unsorted dataset
        - best case performance is n no of swaps/comparison

### Insertion sort
    - Sorts each item in array as they are encountered
    - Insertion sort works from left to right 
        - every thing left of the item is known to be sorted
        - everything right of the item is unsorted
    - Performace of insertion sort
        - similar to bubble sort - worst case n^2
        - not appropriate for large set of data
        - best case n moves

### Selection sort
    - Sort the data by finding smallest item and swapping it into the array in the first unsorted location
    - Performance of Selection sort
        - Worst case n^2
        - Best case performace n^2

### Merge Sort
     - The arrays is recursively split in half
     - when arrays is in group of 1 , it is reconstructed in sort order
     - Each reconstructed array is mergged with the other half
     - Performance of Merge sort
        - Worst case (n log n) - comparisons are required
        - appropriate for large dataset
        - data spliting helps us with parallel comparison operations
        - performance is fixed (n log n)
        - space required - memory foot print does increase

### Quick sort
    - Divide and conquer algorithm
    - Pick a pivot value and partition the array
TODO: more indepth as its widely used sorting algo


