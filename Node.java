//Bonnie Bao and Zhe Yang

package ARRAY_LISTS;

public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev; // Reference to the previous node

    // Constructor to initialize the node's data without any references
    public Node(T dt) {
        data = dt;
        next = null;
        prev = null;
    }

    // Constructor to initialize the node's data with references to next and previous nodes
    public Node(T dt, Node<T> next, Node<T> prev) {
        data = dt;
        this.next = next;
        this.prev = prev;
    }
}