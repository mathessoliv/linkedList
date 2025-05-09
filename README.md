# LinkedList Implementation in Java

Welcome to the **LinkedList** project! This repository contains a custom implementation of a Linked List in Java, showcasing fundamental data structure concepts.

## Features

- **Node-based structure**: Each element (node) contains data and a reference to the next node.
- **Dynamic size**: Automatically adjusts as elements are added or removed.
- **Core operations**:
    - Add elements (at the beginning, end, or specific position).
    - Remove elements (by value or beginning, end, or specifc position).
    - Search for elements.
    - Clear the list.
    - Display the list contents.

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
     cd LinkedList
     ```
3. Compile and run the Java program:
     ```bash
     javac LinkedList.java
     java LinkedList
     ```

## Example Usage

```java
// Create a new LinkedList
LinkedList<Integer> list = new LinkedList<>();

// Create some nodes
Node<Integer> node1 = new Node(1);
Node<Integer> node2 = new Node(2);
Node<Integer> node3 = new Node(3);
Node<Integer> node4 = new Node(4);

// Add nodes to the list
list.append(node1);    // Add at the end
list.prepend(node2);   // Add at the beginning
list.insertAt(2, node3); // Insert at specific position

// Check if list is empty
boolean isEmpty = list.isEmpty(); // Returns false

// Check if list contains a node
boolean contains = list.contains(node1); // Returns true

// Get list size
int size = list.getSize(); // Returns 3

// Print the list
list.printList(); // Output: 2 -> 3 -> 1 -> FIM

// Remove nodes
list.remove(node3);     // Remove specific node
list.removeFirst();     // Remove first node
list.removeLast();      // Remove last node
list.removeAt(1);       // Remove node at specific index

// Clear the list
list.clear(); // Removes all nodes

// After clearing
list.printList(); // Output: (empty list)
```

## Project Structure

```
/LinkedList
├── LinkedList.java   # Core implementation
├── Node.java         # Node structure
├── Main.java         # Main 
└── README.md         # Project documentation
```

## Contributing

Contributions are welcome! Feel free to open issues or submit pull requests to improve this project.

Happy coding! 🚀