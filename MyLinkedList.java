//Bonnie Bao and Zhe Yang

package ARRAY_LISTS;

public class MyLinkedList<T> {
    Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    /**
     * Getter for the start or head of the list
     * @return
     */
    public Node<T> GetHead() {
        return head;
    }

    /**
     * Getter for the end or tail of the list
     * @return
     */
    public Node<T> GetTail() {
        return tail;
    }

    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

     // Method to traverse the list in reverse order and print each node's data
     public void TraverseReverse() {
        Node<T> currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    // Method to remove a specific node from the list
    public void Remove(Node<T> nodeToRemove) {
        if (nodeToRemove == null)
            return;

        if (nodeToRemove.prev != null)
            nodeToRemove.prev.next = nodeToRemove.next;
        else
            head = nodeToRemove.next;

        if (nodeToRemove.next != null)
            nodeToRemove.next.prev = nodeToRemove.prev;
        else
            tail = nodeToRemove.prev;

        size--;
    }

    /**
     * Adds a new node to the end of the LinkedList
     */
    public void Append(T data) {

        if (head == null) {
            // Node<T> newNode = new Node<T>(data); // create the new node and ensure it's next is null
            // size++;
            // head = newNode;
            AddFront(data);
            return;
        }

        // Node<T> currentNode = head;

        // while (currentNode.next != null) {
        //     currentNode = currentNode.next;
        // }

        // once we have our current last node
        Node<T> newNode = new Node<T>(data); // create the new node and ensure it's next is null
        tail.next = newNode; // set the next of the old last node equal to the new node
        tail = newNode;
        size++;
    }
    
    // 1
    public void Insert(int index, T data) {

        // we know they are asking to insert at the last element
        if (index == size) {
            Append(data);
        }

        if (index < 0 || index > size - 1) {
            return;
        }

        Node<T> currentNode = head;

        // go to the element prior to where we want to insert our element
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.next;
        }
        
        Node<T> newNode = new Node<T>(data, currentNode.next);
        currentNode.next = newNode;

    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returnString = "";

        while (currentNode != null) {
            returnString += " " + currentNode.data.toString();
            currentNode = currentNode.next;
        }

        return returnString;
    }

    public void DeleteFront() {

        if (head == tail) {
            tail = null;
        }

        head = head.next;
        size--;
    }
    
    public void DeleteBack() {
        Node<T> currentNode = head;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        //System.out.println(currentNode.data);
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    /**
     * This will find the first instance of matching data and delete it
     * @param data the data of type T whose node we want to delete
     */
    public void DeleteNodeBasedOnValue(T data) {
        
        if (head == null) {
            return;
        }
        
        Node<T> currentNode = head;

        if (currentNode.data == data) {
            DeleteFront();
            return;
        }

        if (currentNode.next == null)
            return;

        while (currentNode.next.data != data) {
            currentNode = currentNode.next;
            if (currentNode.next == null)
                return;
        }
        
        //System.out.println(currentNode.data);
        currentNode.next = currentNode.next.next;
        if (currentNode.next == null) {
            tail = currentNode;
        }
        size--;
    }
    
    public int GetSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}