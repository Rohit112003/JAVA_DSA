package ust.BaseAssignment;

public class main {
    public static void main(String[] args) {
        CustomLinkedList list =new CustomLinkedList();
        list.add(5);
        list.add(10);
        list.add(20);
        System.out.println(list.remove());
        list.removeLast();
        System.out.println(list.size());
    }
}
