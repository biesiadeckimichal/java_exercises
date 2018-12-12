package sorting.bubbleSort;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[] myArray = {3, 1, 5};
        BubbleSort.sortInt(myArray);
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println("kolejna funkcja");

        Comparator<Integer> cmp = new ReverseComparator();
        Integer[] myArrayInteger = {3, 1, 5};
        // drugi argument sortComparator wymaga instacji klasy ReverseComparator
        // mozemy zrobic instancje wczesniej jak linijka 13, albo po prostu dodajac
        // new ReverseComparator w nawiasach (myArrayInteger, new ReverseComparator)
        BubbleSort.sortComparator(myArrayInteger, cmp);
        for (Integer i: myArrayInteger) {
            System.out.println(i);
        }

        System.out.println("kolejna funkcja");

        String[] stringArray = {"ola", "pies", "droga"};
        Comparator<String> cmp1 = new StringLengthComparator();
        BubbleSort.sortComparator(stringArray, cmp1);
        for (String s: stringArray) {
            System.out.println(s);
        }


    }
}
