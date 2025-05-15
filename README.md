# LinkedList Implementation in Java

Welcome to the **LinkedList** project! This repository contains a custom implementation of both singly and doubly linked lists in Java, showcasing fundamental data structure concepts.

## Features

- **Node-based structure**: Each element (node) contains data and references to the next (and previous, for doubly linked) nodes.
- **Dynamic size**: Automatically adjusts as elements are added or removed.
- **Core operations**:
    - Add elements (at the beginning, end, or specific position).
    - Remove elements (by value or position).
    - Search for elements.
    - Display the list contents (forward and reverse for doubly linked).
    - Clear the list.
    - Get the size of the list.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system.
- A Java IDE or text editor of your choice.

### Running the Code

1. Clone this repository:
    ```bash
    git clone https://github.com/mathessoliv/linkedList.git
    ```
2. Navigate to the project directory:
    ```bash
    cd linkedList
    ```

#### For Doubly Linked List

```bash
cd doubleLinkedList
javac *.java
java doubleLinkedList.Main
```

#### For Singly Linked List

```bash
cd linkedList
javac *.java
java linkedList.Main
```

## Example Usage

```java
DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

Node<Integer> node0 = new Node<>(0);
Node<Integer> node1 = new Node<>(1);
Node<Integer> node2 = new Node<>(2);
Node<Integer> node3 = new Node<>(3);

// Add nodes
list.append(node1);           // Add at end
list.prepend(node0);          // Add at beginning
list.insertAt(3, node2);      // Add at position 3 (1-based index)
list.append(node3);

// Remove nodes
list.removeFirst();           // Remove from beginning
list.removeLast();            // Remove from end
list.remove(node2);           // Remove by node reference
list.removeAt(1);             // Remove by position

// Check if a node exists
boolean exists = list.contains(node1);

// Get size
int size = list.getSize();

// Print list forward and reverse
list.printList();
list.printReverse();

// Clear the list
list.clear();
```

## Project Structure

```
/LinkedList
├── doubleLinkedList/
│   ├── DoubleLinkedList.java   # Doubly linked list implementation
│   ├── Node.java               # Node structure for doubly linked list
│   └── Main.java               # Example usage for doubly linked list
├── linkedList/
│   ├── LinkedList.java         # Singly linked list implementation
│   ├── Node.java               # Node structure for singly linked list
│   └── Main.java               # Example usage for singly linked list
├── .gitignore
└── README.md                   # Project documentation
```

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.

Happy coding! 🚀