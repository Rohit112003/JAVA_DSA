package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class sample {
    public static void main(String[] args) {
        String s = "the sky is blue";
        Stack<String> newStack = new Stack<>();
        String word = "";
        int n= s.length();
        for(int i =0; i<n; i++){
            if(s.charAt(i)== ' '){
                newStack.push(word);
                word = "";
            }
            else{
                word = word+ s.charAt(i);
            }
        }
        if(word.length()!=0){
            newStack.push(word);
        }
        String ans = "";
        while(newStack.isEmpty()== false){
            word = newStack.pop();
            if(word.length()>0){
                ans = ans + " "+ word;
            }
        }
        System.out.println(ans.trim());


    }
}
