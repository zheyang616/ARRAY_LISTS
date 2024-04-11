//Bonnie Bao and Zhe Yang

package ARRAY_LISTS;

import ARRAY_LISTS.MyLinkedList;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class MyLinkedListTest {

    // Test case to verify the AddFront method
    @Test
    public void testAddFront() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.AddFront(1);
        list.AddFront(2);
        list.AddFront(3);
        assertEquals(" 3 2 1", list.toString());
    }

    // Test case to verify the Append method
    @Test
    public void testAppend() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.Append(1);
        list.Append(2);
        list.Append(3);
        assertEquals(" 1 2 3", list.toString());
        assertEquals(1, myLinkedList.GetSize());
    }

    // Test case to verify the Remove method
    @Test
    public void testRemove() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.AddFront(1);
        Node<Integer> nodeToRemove = list.head;
        list.AddFront(2);
        list.AddFront(3);
        list.Remove(nodeToRemove);
        assertEquals(" 3 2", list.toString());
    }

    // Test case to verify the TraverseReverse method
    @Test
    public void testTraverseReverse() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.AddFront(1);
        list.AddFront(2);
        list.AddFront(3);
        assertEquals(" 1 2 3", list.toString());
    }

    @Test
    public void Insert_InvalidIndex_ShouldThrowException(){



        //Act and assert
        assertThrows(IndexOutOfBoundsException.class, () -> Insert(-1, "Dog"));
    }
}
