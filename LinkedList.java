public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;

    public LinkedList(){
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void add(Node<T> node) {

        // vazio
        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            return;
        }

        // última posição
        this.tail.next = node;
        this.tail = node;

        System.out.println(this.tail.val);
    }

    public void addFirst(Node<T> node) {
        if (isEmpty()) {
            this.head = node;
            this.tail = node;
            return;
        }

        node.next = this.head;
        this.head = node;

        System.out.println(this.head.val);
    }

    public void removeNode(Node<T> node) {
        if(isEmpty()) {
            return;
        }

        Node<T> curr;
        curr = this.head;

        for (int i = 0; curr.next != null; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        System.out.println(curr.val);

    }
}
