package sorting.bubbleSort;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String text1, String text2) {
        return text1.length() - text2.length();
    }
}
