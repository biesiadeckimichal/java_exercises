package sorting.insertionSort;

import sorting.bubbleSort.BubbleSort;

public class Main {
    public static void main(String[] args) {
        Integer[] myArray = {3, 1, 5};
        InsertionSort.sortInt(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

    }
}