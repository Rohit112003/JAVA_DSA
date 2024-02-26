package LL;

public class llPractise {
    private static Node head;

    private class Node{
        int value;
        Node next;
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }

    }
    public void inserrtFirst(int val){
        Node node= new Node(val);
        node.next = head;
        head = node;

    }
    public void insertLast(int val){
        Node node =  new Node(val);
        Node temp  =   head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;

    }
    public int deleteLast(){
        Node temp  = head;
        while(temp.next.next!=null){
            temp = temp.next;

        }
        int val = temp.next.value;
        temp.next = null;
        return val;
    }
    public static void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+ " ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        return val;
    }

    public static void main(String[] args) {
        llPractise practise = new llPractise();
        practise.inserrtFirst(4);
        practise.inserrtFirst(5);
        practise.inserrtFirst(6);
        practise.inserrtFirst(7);
        practise.inserrtFirst(15);
        practise.insertLast(12);
        practise.deleteLast();
        practise.deleteFirst();
        display();
    }
}
