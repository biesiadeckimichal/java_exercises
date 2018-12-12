package myList;

import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {
    private ListNode current;

    public MyIterator(ListNode first) {
        current = first;
    }

    public boolean hasNext() {
        return current != null;
    }

    public Integer next() {
        Integer val = current.getValue();
        current = current.getNext();
        return val;
    }
}
