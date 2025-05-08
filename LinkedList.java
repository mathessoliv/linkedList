public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
<<<<<<< HEAD
    int length = 0;

    public LinkedList() {
=======

    public LinkedList(){
>>>>>>> 06e0c5007186f09951233e79660b2b895d54f77f
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
<<<<<<< HEAD
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void prepend(Node<T> node) {
        if(isEmpty()) {
            this.head = node;
            this.tail = node;
            length++;
            System.out.println("Adicionei no começo porque é vazio " + this.head.value);
=======
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
>>>>>>> 06e0c5007186f09951233e79660b2b895d54f77f
            return;
        }

        node.next = this.head;
        this.head = node;
<<<<<<< HEAD
        length++;
        
        System.out.println("Adicionei no começo da lista " + this.head.value);
    }

    public void append(Node<T> node) {
        if(isEmpty()) {
            this.head = node;
            this.tail = node;
            System.out.println("Adicionei no começo porque é vazio " + this.head.value);
            length++;
            return;
        }

        this.tail.next = node;
        this.tail = node;
        length++;

        System.out.println("Adicionei no final " + this.tail.value);
    }

    public void insertAt(int pos, Node<T> node) {

        int lengthList = 1;

        if (isEmpty()){
            this.head = node;
            this.tail = node;
            return;
        
        } else if (pos == 1) {
            prepend(node);
=======

        System.out.println(this.head.val);
    }

    public void removeNode(Node<T> node) {
        if(isEmpty()) {
>>>>>>> 06e0c5007186f09951233e79660b2b895d54f77f
            return;
        }

        Node<T> curr;
        curr = this.head;

<<<<<<< HEAD
        while (curr != null) {

            if (pos == lengthList+1) {

                if (curr.next == null) {
                    curr.next = node;
                    this.tail = node;
                    length++;

                } else {
                    node.next = curr.next;
                    curr.next = node;
                    length++;
        
                }
                

            } else {
                curr = curr.next;
                lengthList++;
            }

            
        }

    }

    public void remove(Node<T> value){
        if (isEmpty()) {
            return;
        } else if (this.head == value) {

            // se o valor a excluir for o único da linkedlist
            if (this.head.next == null) {
                this.head = null;
                this.tail = null;
                length--;
                return;
            }

            // se o valor a excluir for o head
            System.out.println("Removi o " + this.head.value + " da likedlist");
            this.head = this.head.next;
            length--;
        
        } 

        Node<T> curr;
        curr = this.head;

        while (curr != null) {
          
            if (curr.next == value) {
                System.out.println("Removi o " + curr.next.value + " da likedlist");
                
                if (curr.next.next == null) {
                    curr.next = null;
                    this.tail = curr;
                    length--;
                    return;

                } else {
                    curr.next = curr.next.next;
                }
                
                return;

            } else if (curr.next != null){
                curr = curr.next;

            } else {
                return;
            }
            
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            return;

        } else if (this.head.next == null) {
            System.out.println("Removi o " + this.head.value + " da likedlist");
            this.head = null;
            this.tail = null;
            length--;
            return;
        } 
        
        System.out.println("Removi o head " + this.head.value + " da linkedlist");
        this.head = this.head.next;
        length--;
        return;
    }

    public void removeLast(){
        if (isEmpty()) {
            return;
        
        } else if (this.tail == this.head) {
            System.out.println("Removi o tail " + this.tail.value + " que é o primeiro da linkedlist");
            this.head = null;
            this.tail = null;
            length--;
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {
            
            if (curr.next == this.tail) {
                System.out.println("Removi o tail " + this.tail.value + " da linked list");
                curr.next = null;
                this.tail = curr;
                length--;
            }

            curr = curr.next;
        }
    }

    public void contains(Node<T> node) {
        if (isEmpty()) {
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {

            if (curr == node) {
                System.out.println("O nó " + node.value + " está dentro da linkedlist");
                return;
            } else if (curr.next == null){
                System.out.println("O nó " + node.value + " não está dentro da linkedlist");
            }

            curr = curr.next;
        }
    }

    public int getSize(){
        System.out.println("O tamanho do nó é de: " + length + ".");
        return length;
    }

    public void print(){
        
        Node<T> curr;
        curr = this.head;

        while (curr != null) {
            System.out.print(curr.value);

            if (curr.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.println(" -> FIM");
            }
            
            curr = curr.next;
            
        }

    }

=======
        for (int i = 0; curr.next != null; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;
        System.out.println(curr.val);

    }
>>>>>>> 06e0c5007186f09951233e79660b2b895d54f77f
}
