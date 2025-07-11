package ust.circularLinkedList;

public class main {
    public static void main(String[] args) {
        CircularList list = new CircularList();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.print("List: ");
        list.print();

        list.removeLast();

        System.out.print("After removing first: ");
        list.print();
    }
}
