package ust.Assignment3.ProblemStatemet4;

import java.util.LinkedList;

public class five {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list);
        list.addLast(12);
        System.out.println(list);

    }
}
