package NormalQuestion;

import java.util.LinkedList;
import java.util.Queue;

public class circulargame {
    public static void main(String[] args) {
        int n =5;
        int k =2;
        System.out.println(findTheWinner(n,k));
    }

    private static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i =1; i<=n; i++){
            q.add(i);
        }
        int m = 1;
        while(!(q.size() ==1)){
            if(m==k){
              int val =   q.poll();
                System.out.println(val);
                m=1;
            }
            else if(m<k){
                int val = q.poll();
                m++;
                q.offer(val);
            }
        }
        return q.peek();
    }
}
