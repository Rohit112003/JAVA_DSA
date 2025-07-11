package ust.DoublyLinkedList;

public class DoublyLinkedList {
    class Node {
        int val;
        Node next;

        Node(int val){
            this.val = val;

        }
    }
    Node head;
    Node tail;
    public void add(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail =temp;
        }else{
            tail.next = temp;
            tail=temp;
        }

    }

    public void addFirst(int val){
        Node temp= new Node(val);
        if(head==null) {
            head = tail = temp;
        }
        temp.next =head;
        head= temp;
    }
    public int removeFirst(){
        if(head==null|| tail==null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        return val;
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.next == null) {
            head = tail = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
    }

    public int size(){
        Node temp = head;
        int k = 0;
        while(temp!=null){
            k++;
            temp =temp.next;

        }
        return k;

    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;

        }
    }

}
