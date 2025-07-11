package ust.BaseAssignment;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q.contains(5));


    }
}
