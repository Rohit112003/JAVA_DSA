package Assignment;

import java.util.LinkedList;
import java.util.Queue;

public class joseph {
    public static void main(String[] args) {
        int n =6;
        int k =5;
        int ans = findTheWinner(n,k);
        System.out.println(ans);

    }






    public static int findTheWinner(int n, int k) {
        Queue<Integer> temp = new LinkedList<>();
        for(int i =1; i<=5 ; i++){
            temp.add(i);

        }
        int ans = helper(temp, k);
        return ans;


    }

    public static int helper(Queue<Integer> temp, int k){
        while(temp.size()!=1){
            int i  =1;
            while(i<k){
                int newTemp = temp.peek();
                temp.add(newTemp);
                temp.remove();
                i++;
            }
            temp.remove();
        }
        return temp.peek();

    }
}


