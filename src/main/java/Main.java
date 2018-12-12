import sorting.bubbleSort.BubbleSort;
import sorting.insertionSort.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 5};
        BubbleSort.sortInt(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println();

    }
}
