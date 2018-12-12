package sorting.selectionSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] myArrayList = {10, 1, 15, 3, 5};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(selectionSort.findMinIndex(myArrayList, 1));
        selectionSort.sortInt(myArrayList);
        for (int i = 0; i < myArrayList.length; i++) {
            System.out.println(myArrayList[i]);
        }
    }


}
