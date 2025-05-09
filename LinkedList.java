public class LinkedList<T> {
    
    Node<T> head;
    Node<T> tail;
    int length = 0;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Many times, we'll verify if the head is null. If yes, will return true, else, return false
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    // Method to add the node in the first position
    public void prepend(Node<T> node) {

        // This block verify if the head is null. If isEmpty return true, then adds in the first position
        if(isEmpty()) {
            this.head = node;
            this.tail = node;
            length++;
            return;
        }

        // Else, do the logic to add in the first position
        node.next = this.head;
        this.head = node;
        length++;
    }

    // Method to append the node in the last position of linked list
    public void append(Node<T> node) {

        // Same system verify
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

    // Method for add the node in the specify position using the giving index 
    public void insertAt(int index, Node<T> node) {

        int lengthList = 1;

        // If some condition is true, the node will can't to add in the list, because or he's below, above or node is null.
        if (index < 1 || index > length+2 || node == null) {
            return;
        } 

        // Same logic
        if (isEmpty()){
            this.head = node;
            this.tail = node;
            length++;
            return;
        
        // If index is one, so it'll add in the first index
        } else if (index == 1) {
            prepend(node);
            return;
        }

        Node<T> curr;
        curr = this.head;

        // This loop system will be used throughout the code to iterate through the linked list
        while (curr != null) {

            if (index == lengthList+1) {

                // changes the tail
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

    // Method to remove the first value in the list
    public void remove(Node<T> value){
        if (value == null) {
            return;
        }

        if (isEmpty()) {
            return;

        } else if (this.head == value) {

            // If the value to exclude is the unique in the list
            if (this.head.next == null) {
                this.head = null;
                this.tail = null;
                length--;
                return;
            }

            // If the value to exclude is the head
            this.head = this.head.next;
            length--;
            return;
        
        } 

        Node<T> curr;
        curr = this.head;

        while (curr != null) {
            
            // Logic to remove
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

    // Method to remove first item from list
    public void removeFirst(){
        if (isEmpty()) {
            return;

        // First node is unique in list
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

    // Method to remove the tail of the list
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

    // Method to remove a value using an index specific
    public void removeAt(int index){
        if (index > length || index < 1 || isEmpty()) {
            return;
        }

        // If index is the first, he's the node, then exists some differences between other logic to remove
        if (index == 1) {

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

            // The main logic
            if (index == lengthList+1){

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

    // Method to know if the value exists in the linked list
    public boolean contains(Node<T> node) {
        if (isEmpty() || node == null) {
            return false;
        }

        Node<T> curr;
        curr = this.head;

        while (curr != null) {

            if (curr == node) {
                return true;
            } 
            curr = curr.next;
        }

        return false;
    }

    // Method to get a size of the linked list
    public int getSize(){
        System.out.println("O tamanho do nó é de: " + length + ".");
        return length;
    }

    public void clear(){
        this.head = null;
        this.tail = null;
        length = 0;
    }

    // Method to print the linked list (used for know how she's)
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
