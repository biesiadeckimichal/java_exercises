package myList.powtorka;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.add(1);
        myList.add(3);
        myList.add(4);
        myList.add(2);
        myList.add(2);

        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.set(2, 8);
        System.out.println(myList);
        System.out.println(myList.size());
        System.out.println(myList.contains(10));
    }



}
