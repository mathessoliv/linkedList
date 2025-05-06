public class Main {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList();

        Node<Integer> node = new Node(1);
        Node<Integer> node2 = new Node(4);
        Node<Integer> node3 = new Node(2);

        list.add(node);
        list.add(node2);

        list.addFirst(node3);

        list.removeNode(node3);

    }
}
