package sorting.bubbleSort;

import java.util.Comparator;

public class BubbleSort {
    public static void sortInt(int[] array) {
        int tmp, count;
        for(int i = 1; i < array.length; i ++) {
//        for(int i = array.length - 2; i >= 0; i --) {
//            for(int j=0; j <= i; j++) {
            count = 0;
            for(int j = 0; j < array.length -i; j++) {
                if(array[j] > array[j+1]) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static <T extends Comparable<T>> void sortGeneric(T[] array) {
        T tmp;
        for(int i = 1; i < array.length; i ++) {
            for(int j = 0; j < array.length - i; j++) {
                if(array[j].compareTo(array[j + 1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static <T> void sortComparator(T[] array, Comparator<T> cmp) {
        T tmp;
        for(int i = 1; i < array.length; i ++) {
            for(int j = 0; j < array.length - i; j++) {
                if(cmp.compare(array[j], array[j + 1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
}
//    public static void sortInt(int[] array) {
//        int tmp;
//        for (int i = array.length - 2; i >= 0; i--) {
//            // count dodajemy po to zeby nie przechodzic przez cala petle
//            // zasada jest taka ze jak 10 elementowa petla jest posortowana
//            // to 9, 8, 7 itp tez bedzie, zmniejszamy ilosc sprawdzanych
//            // elementow i jesli okaze sie ze jest possortowana to nie ma
//            // sensu sprawdzac kolejnych
//            int count = 0;
//            for (int j = 0; j <= i; j++) {
//                if (array[j] > array[j + 1]) {
//                    tmp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = tmp;
//                    count++;
//                }
//            }
//            if (count == 0);
//            break;
//        }
//    }