package linkedlist;

import java.util.Optional;

/**
 * 1 -> 2 -> 3 -> 4 -> 1
 */
public class CycleLinkedList {


    public boolean isCycleLinkedList(LinkedNode node){
        Optional.of(node).orElseThrow(NullPointerException::new);

        LinkedNode firstNode = node;

        LinkedNode tmp = node.getNext();
        while (tmp!=null){
            if (firstNode.getValue()==tmp.getValue())
                return true;
            tmp = tmp.getNext();
        }

        return false;
    }
}
