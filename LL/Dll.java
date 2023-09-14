package LL;

public class Dll {
    private Node head;
    private Node tail;
    public int size;
    public Dll(){
        this.size=0;
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
        Node(int val){
            this.value = val;
        }

    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next= head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;

    }
    public void display(){
        Node node = head;
        Node last  = null;
        while(node!=null){
            System.out.println(node.value + "->");
            last = node;//doubt
            node = node.next;
        }
        System.out.println("End");
        while(last!=null){
            System.out.println(last.value + "->");
            last = last.prev;
        }
        System.out.println("Start");
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;//doubt
        node.next = null;

        if(head==null){
            node.prev = null;
            head=node;
            return;
        }
        while(last.next!=null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;

    }
    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void insert(int after, int val) {
        Node p = find(after);

        if (p == null) {
            System.out.println("does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }
}
