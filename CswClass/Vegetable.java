package CswClass;

public class Vegetable {
    private String name;
    private int price;

    Vegetable(String name, int price){
        this.name= name;
        this.price= price;
    }
    public String getname(){
        return name;
    }
    public int getPrice(){
        return price;
    }

}
class Node{
    public Vegetable info;
    public Node next;

    public Node(Vegetable info) {
        this.info = info;
        this.next = null;
    }

    public Vegetable getInfo() {
        return info;
    }
}
class LinkedList{
    private Node head;

    public LinkedList(){
        head=null;
    }
    public void add(Vegetable vegetable){
        Node newNode = new Node(vegetable);
        if(head==null){
            head=newNode;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            Vegetable vegetable = current.getInfo();
            System.out.println("Name: " + vegetable.getname() + ", Price: " + vegetable.getPrice());
            current = current.next;
        }
    }
}
