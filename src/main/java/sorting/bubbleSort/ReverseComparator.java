package sorting.bubbleSort;

import java.util.Comparator;

public class ReverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer integer, Integer t1) {
        // odwracamy tu porzadek porownania
        return t1.compareTo(integer);
    }


}
