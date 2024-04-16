

public class MyStack<T> {
    private Node<T> head = null;

    public void Push(T data) {
        Node<T> newNode = new Node<T>(data, head);

        head = newNode;
    }

    public T Peek(){
        return head.data;
    }

    /**
     * Will remove the top item fromm the list and return it's data
     * @return the data from the emelent that was removed
     */
    public T Pop(){
        if (head == null) {
            return null;
        }

        T topElementData = head.data;

        head = head.next;
        return topElementData;
    }
    /**
     * Checks if the stack is empty
     * @return returns true if empty, false otherwise.
     */
    public boolean IsEmpty(){
        return head == null;
    }

    /**
     * Clears the entire list at one time
     */
    
     public void Clear(){
        head = null;
     }
}
