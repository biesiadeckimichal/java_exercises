package mergeList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 3, 6, 9, 11};
        Integer[] arr2 = new Integer[] {2, 4};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(merge(list1, list2));
    }

    public static List<Integer> merge(List<Integer> first, List<Integer> second) {
        List<Integer> result = new ArrayList<>(first.size()+second.size());
        int i = 0, j = 0;
        Integer x, y;

        while (i < first.size() & j < second.size()) {
            x = first.get(i);
            y = second.get(j);
            if (x < y) {
                result.add(x);
                i += 1;
            } else {
                result.add(y);
                j += 1;
            }
        }

        while (i < first.size()) {
            result.add(first.get(i));
            i++;
        }
        while (j < second.size()) {
            result.add(second.get(j));
            j++;
        }
        return result;

    }
}
