package CswClass;
import java.util.ArrayList;
public class Arraylistimplement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(1,10);
        System.out.println(list);
        list.remove(3);
//        list.remove(7);
        System.out.println(list.size());


    }


}
