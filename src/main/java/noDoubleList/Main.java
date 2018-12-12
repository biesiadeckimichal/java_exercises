package noDoubleList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> myList = new LinkedList<>();
        myList.add(1);
        myList.add(3);
        myList.add(1);
        myList.add(4);
        myList.add(5);
        myList.add(5);
        myList.add(8);
        System.out.println(removeDuplicates(myList));
        System.out.println(myList.stream().distinct().collect(Collectors.toList()));
    }

    public static LinkedList<Integer> removeDuplicates(LinkedList<Integer> myList) {
        HashSet<Integer> mySet = new HashSet<>();
        LinkedList<Integer> newList = new LinkedList<>();
        for (Integer element: myList) {
            if (mySet.contains(element) == false) {
                mySet.add(element);
                newList.add(element);
            }
        }
        return newList;
    }
}
