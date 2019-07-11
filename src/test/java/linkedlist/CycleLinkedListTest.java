package linkedlist;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CycleLinkedListTest {
    LinkedNode node1 = null;
    LinkedNode node2 = null;
    LinkedNode node3 = null;
    LinkedNode node4 = null;
    LinkedNode node5 = null;

    @org.junit.Before
    public void setUp() throws Exception {
        node1 = new LinkedNode(1);
        node2 = new LinkedNode(2);
        node3 = new LinkedNode(3);
        node4 = new LinkedNode(4);
        node5 = new LinkedNode(5);
    }
    @Test
    public void isCycleLinkedList() {
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node1);

        CycleLinkedList linkedList = new CycleLinkedList();
        Boolean result = linkedList.isCycleLinkedList(node1);
        assertTrue(result);
    }

    @Test
    public void isNotCycleLinkedList() {
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);

        CycleLinkedList linkedList = new CycleLinkedList();
        Boolean result = linkedList.isCycleLinkedList(node1);
        assertFalse(result);
    }

    @Test(expected = NullPointerException.class)
    public void cycleLinkedListIsNull(){
        CycleLinkedList linkedList = new CycleLinkedList();
        Boolean result = linkedList.isCycleLinkedList(null);
    }
}