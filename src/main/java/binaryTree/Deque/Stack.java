package binaryTree.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Stack {
    public static void main(String[] args) {
        // stos kolejka z podwojnym koncem, czyli mozemy brac tylko z poczatku albo konca
        Deque<Integer> queue = new LinkedList<Integer>();
        queue.offerFirst(10);
        queue.offerFirst(100);
        queue.offerFirst(-1);
        while (!queue.isEmpty()) {
            System.out.println(queue.pollFirst());
        }

    }
}
