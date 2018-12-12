package sorting.insertionSort;

public class InsertionSort {

    public static void sortInt(int[] array) {
        int j, value;
        for(int i = 1; i < array.length; i++) {
            value = array[i];
            j = i - 1;
            while(j >= 0 && array[j] > value) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }

    public static void sortStringByLength(String[] array) {
        int j;
        String value;
        for(int i = 1; i < array.length; i++) {
            value = array[i];
            j = i - 1;
            while(j >= 0 && array[j].length() > value.length()) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }

    public static <T extends Comparable> void sortInt(T[] array) {
        int j;
        T value;
        for (int i = 1; i < array.length; i++) {
            value = array[i];
            j = i - 1;
            while (j >= 0 && array[j].compareTo(value) > 0) {
                // x > y -> >0
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = value;
        }
    }
}
