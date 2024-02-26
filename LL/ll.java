package LL;

public class ll {
    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size =0;

    }

    public class Node{
        int value;
        Node next;

        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }
    }
    public void insertFirst(int val){
        Node node= new Node(val);
        node.next = head;
        head = node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next= node;
        tail = node;
        size++;
    }
    public void insert(int val, int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp= head;
        for(int i =0; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondlast = get(size-2);
        int val = tail.value;
        tail = secondlast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index==0){
            return  deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    private int deleteFirst() {
        int val = head.value;

        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public Node get(int index){
        Node node= head;
        for(int i =0; i<index;i++){
            node = node.next;
        }
        return node;
    }
    public Node find(int value){
        Node node = head;
        while(node!=null){
            if(node.value ==value){
                return node;
            }
            node  = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.value + "->");
            temp= temp.next;
        }
        System.out.println("END");
    }
    public void reverse(Node node){
        if(node==tail){
            head=tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public Node oddEvenList(Node head) {
        Node odd = head;
        Node even = head.next;
        while(odd.next!=null){
            odd.next = odd.next.next;
        }
        while(even.next!=null){
            even.next = even.next.next;
        }
        odd.next = even;
        return head;
    }

        public Node getIntersectionNode(Node headA, Node headB) {
            while(headB != null) {
                Node temp = headA;

                while(temp != null) {
                    if(temp == headB) return headB;
                    temp = temp.next;
                }

                headB = headB.next;
            }
            return null;
        }

    public void insertRec(int val, int index) {
        head = insertRec(val, index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if(index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }


}
