package question;

import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        String s  = "abc";
        String t =  "ahbgdc";
         sequence(s,t);
    }

    private static void sequence(String s, String t) {
        char[] charArray = t.toCharArray();
        Arrays.sort(charArray);
        System.out.println(charArray);
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length(); i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.size());
        for(int i = 0; i <=st.size(); i++){
            System.out.println(st.pop());
        }
        System.out.println(st.pop());
        System.out.println(st.size());
    }
}
