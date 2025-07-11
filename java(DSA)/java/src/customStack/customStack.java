package customStack;

import java.util.ArrayList;
import java.util.Arrays;

public class customStack {
    int val;
    ArrayList<Integer> array = new ArrayList<>();
    int k =0;

    
    public void push(int val){

        array.add(val);
        k++;
        System.out.println(array);
    }
    public int pop(){
        int temp = array.get(array.size()-1);
        array.remove(array.size()-1);
        k=array.size()-1;
        return temp;
    }
    public int peek(){
        int temp = array.get(array.size()-1);
        return temp;
    }
    public int size(){
        return k;
    }
    public boolean isEmpty(){
        if(array.size()==0){
           return true;
        }
        return false;
    }
    
    
}
