package ARRAY_LISTS;

import java.beans.Transient;

public class MyLinkedList<T> {
    private Node<T> head = null; // Reference to the first node
    private Node<T> tail = null; // Reference to the last node
    private int size = 0; // Variable to keep track of the list size

    // Method to add a new node to the front of the list
    public void AddFront(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Method to add a new node to the end of the list
    public void Append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
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

    // Method to traverse the list in reverse order and print each node's data
    public void TraverseReverse() {
        Node<T> currentNode = tail;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.prev;
        }
        System.out.println();
    }

    // Override toString method to provide a string representation of the list
    @Override
    public String toString() {
        Node<T> currentNode = head;
        StringBuilder returnString = new StringBuilder();

        while (currentNode != null) {
            returnString.append(" ").append(currentNode.data.toString());
            currentNode = currentNode.next;
        }

        return returnString.toString();
    }

    // Method to get the size of the list
    public int GetSize() {
        return size;
    }

    public void DeleteFront(){
        if (head == tail){
            tail = null;
        }
    }

    
}