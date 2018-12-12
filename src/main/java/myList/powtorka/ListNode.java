package myList.powtorka;

public class ListNode {
    private Integer value;
    private ListNode next;

    public ListNode(Integer value) {
        this.value = value;
        this.next = null; // czy musimy tu dawac null? Nie wystarczy pominac?
    }

    public ListNode(Integer value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "" + this.getValue();
    }

}
