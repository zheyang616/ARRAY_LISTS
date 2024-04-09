package ARRAY_LISTS;

import java.beans.Transient;

public class MyLinkedList<T> {
    private Node<T> head = null;
    private int size = 0;

    public void AddFront(T data){
        Node<T> newNode = new Node<T>(data);
        newNode.data = data;
        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
        
    }

    public void Append(T data){

        if(head == null){
            // Node<T> newNode = new Node<T>(data);//create the new node and unsure it's next
            // size++;
            // head = newNode;
            AddFront(data);
            return;
        }

        Node<T> currentNode = head;

        

        while (currentNode.next != null) {
            currentNode = currentNode.next;
            
        }
        size++;

    //once we have our current last node
    Node<T> newNode = new Node<T>(data);//create the new node and unsure it's next
    currentNode.next = newNode; // set the next of the old last node
}

    public void Insert(int index, T data){
        Node<T> currentNode = head;
        int currentIndex = 0;

        //go to the element prior to where we want to insert our element
        for(int i = 0; i < index - 1; i++){
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
    // //**
    // *Adds a new node to the end of the LinkedList
    // */

    public void DeleteFront(){
        //Node<T> currentNode = head;
        head = head.next; 
    }

    public void DeleteBack(){
        Node<T> currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode = null;
        //System.out.println(currentNode.data);
    }

    /**
     * This will find the first instance of matching data and delete it
     * @param data the data of type T whose node we want to delete
     */
    public void DeleteNodeBasedOnValue(T data){
        
        
        Node<T> currentNode = head;
    
        if (currentNode.data == data) {
            DeleteFront();
            return;
            
        }

        while (currentNode.next.data != data) {
            currentNode = currentNode.next;
        }
        System.out.println(currentNode.data);
        currentNode.next = currentNode.next.next;
    }

    public int GetSize(){
        return size;
    }

    public boolean IsEmpty(){
        return head == null;
    }
}

public class MyLinkedListTest {
    @Test
    public void DeleteNodeBasedOnValue_ElementNotInList_ListShouldRemainEmpty(){
        //Arrange-Act-Assert

        //Arrange
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.AddFront("Hello");

        //Act
        myLinkedList.DeleteNodeBasedOnValue("Art");

        //Assert
        assertEquals(myLinkedList.GetSize(), 0);


    }
    
}
