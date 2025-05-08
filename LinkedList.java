public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int length = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
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
            return;
        }

        node.next = this.head;
        this.head = node;
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

        if (pos < 1 || pos > length+2 || node == null) {
            return;
        } 

        if (isEmpty()){
            this.head = node;
            this.tail = node;
            length++;
            return;
        
        } else if (pos == 1) {
            prepend(node);
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {

            if (pos == lengthList+1) {

                if (curr.next == null) {
                    curr.next = node;
                    this.tail = node;
                    length++;
                    return;

                } else {
                    node.next = curr.next;
                    curr.next = node;
                    length++;
                    return;
                }
                
            } else {
                curr = curr.next;
                lengthList++;
            }
        }
    }

    public void remove(Node<T> value){
        if (value == null) {
            return;
        }

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
            return;
        
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
                    length--;
                    return;    
                }           
            }

            curr = curr.next;

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
        if (isEmpty() || node == null) {
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {

            if (curr == node) {
                System.out.println("O nó " + node.value + " está dentro da linkedlist");
                return;
            } 
            curr = curr.next;
        }

        System.out.println("O nó " + node.value + " não está dentro da linkedlist");
        
    }

    public int getSize(){
        System.out.println("O tamanho do nó é de: " + length + ".");
        return length;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        length = 0;
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

}
