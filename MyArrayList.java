package ARRAY_LISTS;


public class MyArrayList {
    private int[] elements;
    private int size;
    private final int CAPACITY = 10;

    public MyArrayList() {
        //create an array with an initialize size of 10
        elements = new int[10];// initial capacity
        size = 0; //keeps track of the number of elements
        //actually exist in our arraylist
        
    }
    public void AddStart(int elementToAdd){
        EnsureCapacity();

        for (int i = size; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[0] = elementToAdd;
        size++;
    }
    
    public void AddEnd(int elementToAdd){
        EnsureCapacity();
        elements[size] = elementToAdd;
        size++;
    }
    public void AddAtIndex(int elementToAdd, int indexToAddAt){
        
        if (indexToAddAt > size || indexToAddAt < 0) {
            //throw an error
            AddEnd(elementToAdd);
        }else{
            EnsureCapacity();
        }
        
        for (int i = size; i >= 0; i--) {
            elements[i + 1] = elements[i];
        }
        elements[indexToAddAt] = elementToAdd;
        size++;
    }

    public int GetElementAtIndex(int index){
        if (index >= size || index < 0) {
            return elements[size - 1];
    }
        return elements[index];
}
    /**
     * Checks the capacity of our elements array and
     * increases its capacity if there isn't enough space
     */
    private void EnsureCapacity(){
        if (size == elements.length) {
            //increase the capacity/size of the array
            int[] newElements = new int[elements.length * 2];

            for(int i = 0; i < size; i++){
                newElements[i] = elements[i];
            }

            elements = newElements;
        }
    }

    public void Print(){
        for(int i = 0; i < size; i++)
        System.out.print(elements[i] + " ");
        System.out.println(" ");
    }
    
}
