package ust.BaseAssignment;

public class CustomLinkedList {
    private class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private int k;

    public void add(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            Node temp2 = head;
            while (temp2.next != null) {
                temp2 = temp2.next;
            }
            temp2.next = temp;
        }
        k++;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
        k--;
    }

    public void addFirst(int val) {
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        k++;
    }

    public int remove() {
        if (head == null) {
            System.out.println("List is already empty");
            return -1;
        }
        int val = head.val;
        head = head.next;
        k--;
        return val;
    }

    public int size() {
        return k;
    }
}
