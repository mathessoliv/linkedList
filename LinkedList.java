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
            return;
        }

        node.next = this.head;
        this.head = node;
        length++;
    }

    public void append(Node<T> node) {
        if(isEmpty()) {
            this.head = node;
            this.tail = node;
            length++;
            return;
        }

        this.tail.next = node;
        this.tail = node;
        length++;
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
            this.head = this.head.next;
            length--;
            return;
        
        } 

        Node<T> curr;
        curr = this.head;

        while (curr != null) {
          
            if (curr.next == value) {
                
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
            this.head = null;
            this.tail = null;
            length--;
            return;
        } 
        
        this.head = this.head.next;
        length--;
        return;
    }

    public void removeLast(){
        if (isEmpty()) {
            return;
        
        } else if (this.tail == this.head) {
            this.head = null;
            this.tail = null;
            length--;
            return;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {
            
            if (curr.next == this.tail) {
                curr.next = null;
                this.tail = curr;
                length--;
            }

            curr = curr.next;
        }
    }

    public void removeAt(int pos){
        if (pos > length || pos < 1 || isEmpty()) {
            return;
        }

        if (pos == 1) {

            if (this.head.next == null) {
                this.head = null;
                this.tail = null;
                length--;
                return;
            
            } else {
                length--;
                this.head = this.head.next;
                return;
            }
        }

        Node<T> curr;
        curr = this.head;

        int lengthList= 1;

        while (curr != null) {

            if (pos == lengthList+1){

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

            } else {
                lengthList++;
                curr = curr.next;
            }
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
                return;
            } 
            curr = curr.next;
        }
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

    public void printList(){
        
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
