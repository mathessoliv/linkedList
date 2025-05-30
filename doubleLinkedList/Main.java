package doubleLinkedList;

public class Main {
    public static void main(String[] args) {
        
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        Node<Integer> node0 = new Node(0);
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(2);
        Node<Integer> node3 = new Node(3);
        Node<Integer> node4 = new Node(4);
        Node<Integer> node5 = new Node(5);
        Node<Integer> node6 = new Node(6);
        Node<Integer> node7 = new Node(7);
        Node<Integer> node8 = new Node(8);

        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.append(node4);
        list.append(node5);
        
        list.prepend(node0);

        list.remove(node5);
        list.printList();
        System.out.println();

        list.append(node5);
        list.printList();
        System.out.println();

        list.removeFirst();
        list.printList();

        System.out.println();
        list.removeLast();
        list.printList();

        System.out.println();
        list.contains(node0);

        list.append(node6);
        list.append(node7);

        System.out.println();
        list.printList();
        list.getSize();
        System.out.println();

        System.out.println("Insert at: ");
        list.insertAt(8, node8);
        list.printList();
        list.getSize();
        System.out.println();

        System.out.println("Remove at:");
        list.removeAt(7);
        list.printList();
        list.getSize();

        System.out.println();
        list.printList();
        list.printReverse();

        System.out.println();
        System.out.println("Clear");
        list.clear();
        list.printList();
    }
}
