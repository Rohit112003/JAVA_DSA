package BackTracking;

import java.sql.Array;
import java.util.ArrayList;

public class paths {
    public static void main(String[] args) {
        ArrayList<String> ans = pathret("", 3,3);
        System.out.println(ans);
    }

    private static void path(String s, int r, int c) {
        if(r==1 &&  c==1){
            System.out.println(s);
            return;
        }
        if(r>1){
            path(s+"D" , r-1,c);
        }
        if(c>1){
            path(s+"R", r,c-1);
        }
    }
    private static ArrayList<String> pathret(String s, int r, int c) {
    ArrayList<String> newList = new ArrayList<>();
        if(r==1 &&  c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list ;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1){
           list.addAll(pathret(s+"D" , r-1,c)) ;
        }
        if(c>1){
            list.addAll(pathret(s+"R", r,c-1));
        }
        return list;
    }
}
