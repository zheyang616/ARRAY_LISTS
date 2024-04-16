//Bonnie Bao and Zhe Yang


public class Node<T> {
    T data;
    Node<T> next;
    Node<T> prev;

    // Constructor to initialize the node's data without any references
    public Node(T dt) {
        data = dt;
        next = null;
        prev = null;
    }

    public Node(T dt, Node<T> next) {
        data = dt;
        this.next = next;

    }

    // Constructor to initialize the node's data with references to next and previous nodes
    public Node(T dt, Node<T> next, Node<T> prev) {
        data = dt;
        this.next = next;
        this.prev = prev;
    }


}