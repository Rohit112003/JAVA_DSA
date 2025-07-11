package ust.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.addFirst(40);
        System.out.println(list.size());
        list.print();
        list.removeFirst();
        System.out.println();
        list.print();
        System.out.println();
        list.removeLast();
        list.print();
    }
}
