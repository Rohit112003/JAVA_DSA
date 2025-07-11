package Array;

import java.util.Stack;

public class LengthOFlastword {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        ;
        System.out.println(lengthOfLastWord(s));
    }
    public static int lengthOfLastWord(String s) {
//        Stack<String> st=new Stack<>();
//       String newString= s.trim();
//        int i =0;
//        String subString = " ";
//        while(i<newString.length()){
//            if(newString.charAt(i)==' '){
//                st.add(subString);
//                subString ="";
//            }
//            subString+=newString.charAt(i);
//            i++;
//        }
//        st.add(subString);
//        String ans = st.pop();
//        return ans.length();

        s = s.trim();
        int length = 0, i = s.length() - 1;

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;



    }
}
