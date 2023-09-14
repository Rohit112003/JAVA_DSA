package LL;

public class main {
    public static void main(String[] args) {

        ll first = new ll();
        ll second = new ll();
        ll third = new ll();
        first.insertFirst(5);
        first.insertFirst(6);
        first.insertFirst(1);
        first.insertFirst(4);
        first.insertFirst(5);


        second.insertFirst(4);
        second.insertFirst(1);
        second.insertFirst(8);
        second.insertFirst(4);
        second.insertFirst(5);

        first.display();
        second.display();

//        third.getIntersectionNode(first, second);

//        first.insertRec(88, 2);
        first.display();
//        first.oddEvenList(5)
//    first.reverse();
    }
}
