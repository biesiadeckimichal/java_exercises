package myList;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(4);
        myList.add(6);
        myList.add(6);

        System.out.println(myList);
        System.out.println(myList.get(2));
        System.out.println(myList.contains(4));
        myList.remove(1);
        System.out.println(myList);
    }
}
