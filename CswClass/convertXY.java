package CswClass;

import java.util.LinkedList;
import java.util.Queue;

public class convertXY {
    public static void main(String[] args) {
        int x = 2;
        int y= 10;
        Queue<Integer> newQueue= new LinkedList<>();
        newQueue.offer(x);
        int step = 0;
        while(!newQueue.isEmpty()){
            int size = newQueue.size();
            step++;
            for (int i = 0; i < size; i++) {
                int current = newQueue.poll();
                int multiplyByTwo = current*2;
                if(multiplyByTwo==y) {
//                    System.out.println(step);
                    break;
                } else if (multiplyByTwo<y) {
                    newQueue.offer(multiplyByTwo);
                }
                int addone = current+1;
                if(addone==y){
//                    System.out.println(step);
                    break;
                }else if(addone<y){
                    newQueue.offer(addone);
                }
            }
        }
        System.out.println(step);
    }
}
