package sorting.selectionSort;

public class SelectionSort {

    public void sortInt(int[] array) {
        int ind, tmp;
        for (int i = 0; i < array.length; i++) {
            ind = findMinIndex(array, i);
            if (ind != i) {
                tmp = array[i];
                array[i] = array[ind];
                array[ind] = tmp;
            }
        }
    }

    public int findMinIndex(int[] array, int start) {
        int minimum = array[start];
        int indexMinimum = start;
        // start + 1, dajemy dlatego zeby nie porownywac startu ze startem
        for (int i = start + 1; i < array.length; i++) {
            if (array[i] < minimum ) {
                minimum = array[i];
                indexMinimum = i;
            }
        }
        return indexMinimum;
    }
}
