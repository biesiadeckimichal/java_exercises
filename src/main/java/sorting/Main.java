package sorting;

import sorting.bubbleSort.BubbleSort;
import sorting.insertionSort.InsertionSort;
import sorting.mergeSort.MergeSort;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 5, 5, -1, 4, 9};
        int[] myArray2 = {2, 1, 9};
        int[] mergedArray = MergeSort.sortInt(myArray);

        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i]);
        }
        System.out.println();

    }
}
