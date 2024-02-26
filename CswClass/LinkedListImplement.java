package CswClass;
import java.util.LinkedList;
public class LinkedListImplement {
    public static void main(String[] args) {
        LinkedList<String> list = new  LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        System.out.println(list);
        list.add(1,"B2");
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }
}
