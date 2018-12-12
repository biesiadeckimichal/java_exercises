package myList;

public class ListNode {
    private Integer value;
    private ListNode next;
    // konstruktor domyslny tylko inicjalizuje dana klase
    // alokuje miejsce w pamiecie
    // konstruktor domyslny jest tworzony przez jave automatycznie
    // ale jesli stworzymy swoj konstruktor ten domyslny jest nadpisywany przez nasz
    // jesli chcemy miec nasz i domyslny musimy napisac oba
    // domyslny istnieje tylko do momentu gdy nie ma naszego prywatnego

    public ListNode(Integer value) {
        this.value = value;
        this.next = null;
    }

    public ListNode(Integer value, ListNode next) {
        this.value = value;
        this.next = next;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
