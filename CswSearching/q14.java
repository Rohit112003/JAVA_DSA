package CswSearching;
import java.util.ArrayList;
public class q14 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        ArrayList<Integer> list2 = new ArrayList<>(10);
//        System.out.println(list.size());
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list2.add(2);
        list2.add(5);
        list2.add(7);
        list2.add(4);
        list2.add(5);
        list2.add(5);
        list2.add(5);
        list2.add(5);





        list.retainAll(list2);
        System.out.println(list);

    }
}
