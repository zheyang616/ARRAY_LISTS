
//package ARRAY_LISTS;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class MyLinkedStackTests {
    @Test
    public void Push_AddNodeWhenListIsEmpty_ShouldSuccessfullyAdd(){
        //Arrange
        MyStack<String> myLinkedStack = new MyStack<String>();

        //Act
        myLinkedStack.Push("Hello");
        

        //Assert
        assertEquals("Hello", myLinkedStack.Peek());
    }

    @Test
    public void Pop_WhenListHasValues_ShouldReturnElementThatIsRemoved(){
        //Arrange
        String expectedString = "hello";
        MyLinkedStack myLinkedStack = new MylinkedStack<String>();
        myLinkedStack.Push("hello");

        //Act
        String removedElement = myLinkedStack.Pop();

        //Assert
        assertEquals(null, myLinkedStack.Pop());

    }

    @Test
    public void IsEmpty_WhenListIsEmpty_ShouldReturnTrue(){
        //Arrange
        boolean isEmpty = MyLinkedStack.IsEmpty();

        //Act
        boolean isEmpty = myLinkedStack.IsEmpty();

        //Assert
        assertFalse(isEmpty);
    }
}
