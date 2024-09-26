package linkedlist;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

/**
 * 1 -> 2 -> 3 -> 4 -> 1
 */
public class CycleLinkedList {

    public boolean isCycleLinkedList(LinkedNode node){
        Optional.of(node).orElseThrow(NullPointerException::new);

        LinkedNode slow = node.getNext();
        LinkedNode faster = node.getNext().getNext();

        while (slow!=null && faster!=null){
            slow = slow.getNext();

            if(faster.getNext()==null) return false;
            
            faster = faster.getNext().getNext();
            if(slow.getValue()==faster.getValue()) return true;
        }

        return false;
    }

    /**
     * 1 -> 2 -> 3 -> 4 -> 1
     * @param node
     * @return
     */
    public boolean isCycleLinkedList2(LinkedNode node){
        Optional.of(node).orElseThrow(NullPointerException::new);

        Set<LinkedNode> linkedNodeSet = new HashSet<LinkedNode>();

        LinkedNode tmp = node;
        linkedNodeSet.add(node);
        while (tmp.getNext()!=null){
            tmp = tmp.getNext();
            if(linkedNodeSet.contains(tmp))return true;
            linkedNodeSet.add(tmp);
        }

        return false;
    }
}
