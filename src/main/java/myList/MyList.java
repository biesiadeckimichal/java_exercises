package myList;

import java.awt.*;
import java.util.Iterator;

public class MyList implements Iterable<Integer> {
    private ListNode first, last;
    private int count;

    public void add (Integer value) {
        ListNode newNode = new ListNode(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        count += 1;
    }

    public Integer get2 (int i) {
        return findNode(i).getValue();
    }

    public void set(int i, Integer value) {
        findNode(i).setValue(value);
    }

    public Integer get(int index) {
        ListNode node = first;
        while (node != null) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            return node.getValue();
        }
        throw new IndexOutOfBoundsException("index poza zakresem");
    }

    public boolean contains(Integer value) {
        ListNode node = first;
        for (int i = 0; i <= size(); i++) {
            if (node.getValue()==value) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public boolean contains2(Integer value) {
        ListNode node = first;
        while(node != null) {
            if (node.getValue().equals(value)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public int size() {
        return count;
    }

    private ListNode findNode(int i) {
        if (i < 0 || i >= size()) {
            throw new IndexOutOfBoundsException(
                    "Niepoprawny index: " + Integer.toString(i));
        }
        ListNode node = first;
        for (int j = 0; j < i; j++) {
            node = node.getNext();
        }
        return node;
    }

    public void remove(int index) {


    }

    @Override
    public String toString() {
        if (first == null) {
            return "pusta lista";
        }
        ListNode node = first;
        String s = "";
        while (node != null) {
            s += node.getValue() +" ";
            node = node.getNext();
        }
        return s;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyIterator(first);
    }
}

    // node.getNext().getValue() -
    // node.getNext() pobiera kolejnego noda, a get value wskazuje nam jego wartosc