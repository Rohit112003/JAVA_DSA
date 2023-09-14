package BackTracking;

import java.util.ArrayList;

public class pathDiagonal {
    public static void main(String[] args) {
        ArrayList<String> ans = path("", 3,3);
        System.out.println(ans);
    }

    private static ArrayList<String> path(String s, int r, int c) {
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(s);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(path(s+"DI", r-1,c-1));
        }
        if(r>1){
            list.addAll(path(s+"D", r-1,c));
        }
        if(c>1){
            list.addAll((path(s+"R", r,c-1)));
        }
        return list;
    }
}
