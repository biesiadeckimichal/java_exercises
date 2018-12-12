package myList.powtorka;

public class MyList {
    private ListNode first;
    private ListNode last;
    int count;

    public void add(Integer value) {
        ListNode newNode = new ListNode(value);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        count++;
    }

    public Integer get(int index) {
        ListNode node = first; // czy musimy to za kazdym razem deklarowac
        while (node != null) {
            for (int i = 0; i < index; i++) {
                node = node.getNext();
            }
            return node.getValue();
        }
        throw new IndexOutOfBoundsException("index poza zakresem"); // nie działa
    }

    public void set(int index, Integer value) {
        ListNode node = first;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        node.setValue(value);
    }

    public boolean contains(Integer value) {
        ListNode node = first;
        for (int i = 0; i < size(); i++) {
            if (node.getValue() == value) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public boolean contains1(Integer value) {
        if (first.getValue() == value) {
            return true;
        }
        ListNode node = first;
        while (node != null) {
            node = node.getNext();
            if (node.getValue() == value) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public int size () {
        return count;
    }

    @Override
    public String toString() {
        if (first == null) {
            return "Lista pusta";
        }
        ListNode node = first;
        String text = "";
        while (node != null) {
            text += node.getValue() + " ";
            node = node.getNext();
        }
        return text;
    }


}
