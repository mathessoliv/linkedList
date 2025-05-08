# LinkedList Implementation in Java

Welcome to the **LinkedList** project! This repository contains a custom implementation of a Linked List in Java, showcasing fundamental data structure concepts.

## Features

- **Node-based structure**: Each element (node) contains data and a reference to the next node.
- **Dynamic size**: Automatically adjusts as elements are added or removed.
- **Core operations**:
    - Add elements (at the beginning, end, or specific position).
    - Remove elements (by value or position).
    - Search for elements.
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
LinkedList list = new LinkedList();
Node<Integer> node = new Node(1);
Node<Integer> node2 = new Node(2);
Node<Integer> node3 = new Node(3);

list.add(node);
list.add(node2);

list.addFirst(node3)
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