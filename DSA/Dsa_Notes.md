# DSA (Data Structures & Algorithms)

## Space and Time Complexity in DSA

In Data Structures and Algorithms (DSA), understanding the efficiency of an algorithm is crucial. This is where space and time complexity come into play.

#### Time Complexity

- **Definition:** It measures the computational cost (time taken) of an algorithm in relation to the input size.
- **Notation:** Commonly expressed using Big O notation (O()).

#### Space Complexity

- **Definition:** It measures the amount of memory space used by an algorithm in relation to the input size.
- **Notation:** Also expressed using Big O notation (O()).

**Key Points:**

- **Trade-off:** Often, there's a trade-off between time and space complexity.
- **Best, Average, and Worst Cases:** Time and space complexity can be analyzed for different scenarios.
- **Auxiliary Space:** This refers to the extra space used by an algorithm apart from the input data.

**Importance:**

- Understanding time and space complexity helps in:
  - Choosing the right algorithm for a given problem.
  - Optimizing existing algorithms.
  - Analyzing the performance of different implementations.

### What is Big O Notation?

Big O notation is a mathematical notation used to describe the limiting behavior of a function when the argument tends towards a particular value or infinity. In simpler terms, it's a way to measure the efficiency or complexity of an algorithm.

#### Time Complexity

- **Constant Time Complexity:** O(1)
- **Linear Time Complexity:** O(n)
- **Logarithmic Time Complexity:** O(log n)
- **Quadratic Time Complexity:** O(n^2)
- **Cubic Time Complexity:** O(n^3)

#### Space Complexity

Space complexity measures the amount of memory an algorithm uses to solve a problem. It's typically expressed using Big O notation.

**Factors Affecting Space Complexity:**

- Input size
- Auxiliary space

## Data Structures 

### Linear Data Structures

### Arrays
Fundamental data structure used to store collections of elements of the same type.
  - Linear data structure
  - Homogeneous data structure
  - Contiguous block of memory
  - Fixed Size


**Declaration Of Arrays**
```
int[] arr;
// OR
int[] arr = new int[size];
```

**Initialization Of Arrays**
```
int[] arr = {1,2,3,4,5};
```

**Types Of Arrays**

![alt text](images/TypesOfArrays.png)

**1D**

- **ArrayList**

  - Dynamic Size

### Linked List

  - Non-contiguous memory
  - Efficient insertion and deletion
  - **Types:** Singly Linked List, Doubly Linked List, Circular Linked List, Doubly Circular Linked List

  - Scratch implementation

```
  class Node {
    int data;
    Node next;

    public Node(int value) {
        this.data = value;
        this.next = null;
    }
  }

  public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String toString() {
        Node current = head;
        StringBuilder res = new StringBuilder();
        while (current != null) {
            res.append(current.data);
            if(current.next != null) {
                res.append(" --> ");
            }
            current = current.next;
        }
        return res.toString();
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
  }
  ```

#### Stack

- **Principle:** LIFO (Last In First Out)
- **Methods:** push(), pop()

#### Queue

- **Principle:** FIFO (First In First Out)
- **Methods:** add(), offer(), enqueue(), remove(), poll(), dequeue(), peek(), isEmpty()

#### HashMap

- Key and value pair
- Speed
- null is valid key or value

**Methods:**

- put(key, value)
- get(key)
- containsKey(key)
- containsValue(value)

### Sorting

- Bubble sort
- Selection Sort
- Insertion Sort

### Bit Manipulation

#### Decimal To Binary

- ...

#### Bitwise Operators

- **Bitwise AND (&)**
- **Bitwise OR (|)**
- **Bitwise NOT (~)**
- **Bitwise XOR (^)**

### Techniques

- ...
