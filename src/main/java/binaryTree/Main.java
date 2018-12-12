package binaryTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree myTree = new BinarySearchTree();
        System.out.println(myTree.add(1));
        System.out.println(myTree.add(0));
        System.out.println(myTree.add(5));
        System.out.println(myTree.add(2));
        System.out.println(myTree.add(6));

        System.out.println(myTree.contains(5));
        System.out.println(myTree.toList());
    }
}
