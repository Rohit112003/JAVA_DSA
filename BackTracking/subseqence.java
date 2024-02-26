package BackTracking;

import java.util.ArrayList;

public class subseqence {
    public static void main(String[] args) {
//        subseq("", "abc");
        ArrayList<String> newList = new ArrayList<>();
//        System.out.println(subseq("", "abc", newList));
//        System.out.println(subseqret("", "abc"));
        subseq("","abc",newList);
        System.out.println(newList);




    }
    static void subseq(String p , String up, ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return ;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1), list);
        subseq(p, up.substring(1),list);
        return ;
    }
    static ArrayList<String> subseqret(String p , String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            System.out.println(list);

            return list ;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqret(p+ch, up.substring(1));
        ArrayList<String>  right = subseqret(p, up.substring(1));
        left.addAll(right);
        System.out.println(left);
        return left;
    }

}
