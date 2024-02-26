package CswClass;
import java.util.*;
import java.util.HashSet;
public class IteratorDemo {
    public static void main(String args[])
    {

        HashSet<String> set = new HashSet<String>();

        set.add("Helllo");
        set.add("EveryOne");
        set.add("how ");
        set.add("it's");
        set.add("going");

        Iterator value = set.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
