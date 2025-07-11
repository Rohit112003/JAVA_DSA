package ust.circularLinkedList;

public class CircularList {
    class Node {
        int data; Node next;
        Node(int data) { this.data = data; }
    }

    Node head = null, tail = null;

    void add(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = tail = temp;
            temp.next = head;
        } else {
            tail.next = temp;
            tail = temp;
            tail.next = head;
        }
    }

    boolean contains(int val) {
        if (head == null) return false;
        Node curr = head;
        do {
            if (curr.data == val) return true;
            curr = curr.next;
        } while (curr != head);
        return false;
    }

    void remove(int val) {
        if (head == null) return;
        if (head.data == val && head == tail) {
            head = tail = null;
            return;
        }

        Node curr = head, prev = tail;
        do {
            if (curr.data == val) {
                if (curr == head) head = head.next;
                if (curr == tail) tail = prev;
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    void print() {
        if (head == null) return;
        Node curr = head;
        do {
            System.out.print(curr.data + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head == tail) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = head;
        tail = temp;
    }

}
