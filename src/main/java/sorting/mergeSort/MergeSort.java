package sorting.mergeSort;

public class MergeSort {
    // metoda merge, nie sortuje, tylko łączy, funkcja sortInt, tak na dobrą
    // sprawe tez nie sortuje, sortowanie dokonuje sie przez polaczenie tych
    // obu funkcji, sortInt dzieli tablice na pol, az dochodzimy do sytuacji
    // w ktorej mamy tablice jednoelementowe, w tym momencie te tablice zaczyna
    // laczyc funkcja merge, i w momencie polaczenia dwoch tablic jednoelementowych
    // mniejszy element przechodzi na poczatek, jak mamy posortowane tablice 2wu elementowe
    // zaczynamy je laczyc ze soba i tworzy sie posortowana tablica 4 elementowe

    public static int[] sortInt(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid + i];
        }
        return merge(sortInt(left), sortInt(right));
    }

    public static int[] merge(int[] array, int[] array2) {
        int[] mergedArray = new int[array.length + array2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < array.length && j < array2.length) {
            if (array[i] <= array2[j]) {
                mergedArray[k] = array[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }
        while (i < array.length) {
            mergedArray[k] = array[i];
            i++;
            k++;
        }
        while (j < array2.length) {
            mergedArray[k] = array2[j];
            j++;
            k++;
        }
        return mergedArray;
    }

}
