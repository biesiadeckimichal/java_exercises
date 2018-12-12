package heap;

public class Main {
    public static void main(String[] args) {
        Heap myHeap = new Heap(30);
        myHeap.add(3);
        myHeap.add(4);
        myHeap.add(6);
        myHeap.add(-1);
        myHeap.add(-11);
        myHeap.add(-90);

        myHeap.printOut();

    }

}
