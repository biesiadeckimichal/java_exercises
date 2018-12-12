package heap;

public class Heap {
    // kopiec
    // kopcem nazywamy tylko takie drzewo ktorego dzieci sa wieksze od rodzica
    // binarne drzewo to takie gdzie po lewo sa mniejsze, po prawo wieksze
    private int[] array;
    private int size;

    public Heap(int capacity) {
        // tu deklarujemy pojemnosc, choc poczatkowo tablica ma zero elementow
        this.array = new int[capacity];
        this.size = size;
    }

    public int getLeftChild(int i) {
        return 2 * i + 1;
    }

    public int getRightChild(int i) {
        return 2 * i + 2;
    }

    public int getParent(int i) {
        return (i - 1) / 2;
    }

    public int pop() {
        int value = array[0];
        array[0] = array[size - 1];
        size--;
        sifDown();
        return value;
    }

    public void sifDown() {
        int idx = 0, left, right;
        while ((getLeftChild(idx) < size && array[idx] > array[getLeftChild(idx)]) ||
                getRightChild(idx) < size && array[idx] > array[getRightChild(idx)]) {
            left = getLeftChild(idx);
            right = getRightChild(idx);
            if (left < size && right < size) {
                // zamiana z mniejszym
                if (array[left] < array[right]) {
                    swap(idx, left);
                    idx = left;
                } else {
                    swap(idx, right);
                    idx = right;
                }
            } else if (right >= size) {
                swap(idx, left);
                idx = left;
            }
        }
    }

        public void swap(int i, int j) {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }

        public void add(int i) {
        array[size] = i;
        sifUp(size);
        size++;
    }

    public void sifUp(int index) {
        int tmp, parentIndex;
        while (index > 0 && array[index] < array[getParent(index)]) {
            parentIndex = getParent(index);
            tmp = array[index];
            array[index] = array[parentIndex];
            array[parentIndex] = tmp;
            index = parentIndex;
        }
    }
    
    public void printOut() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    } 
}
