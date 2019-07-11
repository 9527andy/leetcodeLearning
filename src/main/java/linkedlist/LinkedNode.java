package linkedlist;

public class LinkedNode {
    int value ;
    LinkedNode next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedNode(int value) {
        this.value = value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

}
